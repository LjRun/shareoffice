package cn.provider.service.impl;

import cn.provider.entity.workorder;
import cn.provider.mapper.workorderMapper;
import cn.provider.model.common.CommonModel;
import cn.provider.model.common.ResultStatus;
import cn.provider.model.enums.OrderState;
import cn.provider.model.common.StateCode;
import cn.provider.model.reponse.OrderModel;
import cn.provider.model.request.OrderRequestA;
import cn.provider.service.IOrderService;
import cn.provider.util.helper.StringUtil;
import cn.provider.util.redis.RedisKey;
import cn.provider.util.redis.impl.RedisService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.plaf.nimbus.State;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class OrderService implements IOrderService {
    private Lock _lock = new ReentrantLock();
//    Condition condition = _lock.newCondition();

    @Resource
    private RedisService redisService;

    @Autowired
    private workorderMapper _workorderMapper;

    @Override
    public CommonModel<String> orderAdd(OrderRequestA req) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String ranDom = "";//随机数
        Random ran = new Random();//获取自由数
        for (int i = 0; i < 6; i++) {
            ranDom = ranDom + ran.nextInt(10);
        }
        String orderNo = df.format(new Date()) + ranDom;
        workorder order = new workorder();
        order.setAddress(req.getAddress());
        order.setApplytime(new Date());
        order.setCode(orderNo);
        order.setContactman(req.getContactMan());
        order.setContactphone(req.getContactPhone());
        order.setDepartmentid(req.getDepartmentId());
        order.setDetails(req.getDetails());
        order.setWorkorderstate(OrderState.客服已派单.getValue());
        boolean result = _workorderMapper.insertSelective(order) > 0;
        if (result) {
            return new CommonModel<String>("添加成功", ResultStatus.SUCCESSFUL.getValue(), StateCode.Success, null);
        }
        return new CommonModel<String>("系统错误", ResultStatus.FAILED.getValue(), StateCode.KnownError, null);
    }


    public void orderTokenAdd(String key, String value) {
        try {
            _lock.lock();
            if (!redisService.exists(key)) {
                redisService.set(key, value, new Long(12000));
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            _lock.unlock();
        }
    }

    @Override
    public PageInfo<OrderModel> getOrder(Integer page, Integer size, String orderNo, String contactMan) {
        PageHelper.startPage(page, size);
        return new PageInfo<OrderModel>(_workorderMapper.selectOrder(contactMan, orderNo));
    }





    @Override
    public CommonModel<String> orderOpreate(Integer id, Integer type) {
        workorder order = _workorderMapper.selectByPrimaryKey(id);
        if (order == null) {
            return new CommonModel<String>("该工单id不存在", ResultStatus.FAILED.getValue(), StateCode.KnownError, null);
        }
        switch (type) {
            case 1://取消
                if (order.getWorkorderstate().intValue() == OrderState.未派单.getValue()) {
                    boolean result = _workorderMapper.updateOrderState(id, OrderState.客服已派单.getValue()) > 0;
                    if (result) {
                        return new CommonModel<String>("操作成功", ResultStatus.SUCCESSFUL.getValue(), StateCode.Success, null);
                    }
                }
                break;
            case 2:
                if (order.getWorkorderstate().intValue() == OrderState.未派单.getValue()) {
                    boolean result = _workorderMapper.updateOrderState(id, OrderState.已取消.getValue()) > 0;
                    if (result) {
                        return new CommonModel<String>("操作成功", ResultStatus.SUCCESSFUL.getValue(), StateCode.Success, null);
                    }
                }
                break;
        }
        return new CommonModel<String>("操作失败", ResultStatus.FAILED.getValue(), StateCode.KnownError, null);
    }
}
