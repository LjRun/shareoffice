package cn.provider.mapper;

import cn.provider.entity.workorder;
import cn.provider.model.reponse.OrderModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface workorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(workorder record);

    int insertSelective(workorder record);

    workorder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(workorder record);

    int updateByPrimaryKey(workorder record);

    List<OrderModel> selectOrder(@Param("contactMan") String contactMan,@Param("orderNo") String orderNo);

    int updateOrderState(@Param("id") Integer id,@Param("state") Integer state);
}