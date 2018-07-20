package cn.provider.controllor;

import cn.provider.model.common.CommonModel;
import cn.provider.model.common.ResultStatus;
import cn.provider.model.common.StateCode;
import cn.provider.model.reponse.OrderModel;
import cn.provider.model.request.OrderRequestA;
import cn.provider.service.IOrderService;
import cn.provider.util.redis.impl.*;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("order")
public class OrderControllor {

    @Autowired
    private IOrderService iOrderService;

    //发起工单
    @RequestMapping(value = "orderadd", method = RequestMethod.POST)
    public CommonModel orderAdd(@RequestBody(required = false) OrderRequestA req) {
        if (req == null) {
            return new CommonModel<String>("参数不能为空", 0, StateCode.KnownError, null);
        }
        return iOrderService.orderAdd(req);
    }


    /*
     *获取工单
     * contactMan 联系人
     * orderNo 工单号
     */
    @RequestMapping(value = "getOrder/{size}/{page}/", method = RequestMethod.GET)
    public CommonModel getOrder(@PathVariable Integer page, @PathVariable Integer size, @RequestParam String contactMan, @RequestParam String orderNo) {
        return new CommonModel<PageInfo<OrderModel>>("", ResultStatus.SUCCESSFUL.getValue(), StateCode.Success, iOrderService.getOrder(page, size, orderNo, contactMan));
    }


    /*
     *操作工单
     * id 工单id
     * type 操作类型 1派单，2取消
     */
    public CommonModel opreatOrder(@RequestBody(required = false) Integer id, @RequestBody(required = false) Integer type) {
        if (id == null || type == null) {
            return new CommonModel<String>("参数不能为空", 0, StateCode.KnownError, null);
        }
        return iOrderService.orderOpreate(id,type);
    }
}
