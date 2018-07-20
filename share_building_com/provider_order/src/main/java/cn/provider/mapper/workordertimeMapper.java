package cn.provider.mapper;

import cn.provider.entity.workordertime;

public interface workordertimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(workordertime record);

    int insertSelective(workordertime record);

    workordertime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(workordertime record);

    int updateByPrimaryKey(workordertime record);
}