package cn.provider.service;

import cn.provider.model.common.CommonModel;
import cn.provider.model.reponse.OrderModel;
import cn.provider.model.request.OrderRequestA;
import com.github.pagehelper.PageInfo;

public interface IOrderService {
    CommonModel<String> orderAdd(OrderRequestA req);

    PageInfo<OrderModel> getOrder(Integer page,Integer size,String orderNo,String contactMan);

    /*
    *id 工单id
    * type 操作类型 1派单,2取消
     */
    CommonModel<String> orderOpreate(Integer id,Integer type);
}
