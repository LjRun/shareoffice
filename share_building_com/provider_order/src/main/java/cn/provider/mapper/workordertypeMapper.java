package cn.provider.mapper;

import cn.provider.entity.workordertype;

public interface workordertypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(workordertype record);

    int insertSelective(workordertype record);

    workordertype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(workordertype record);

    int updateByPrimaryKey(workordertype record);
}