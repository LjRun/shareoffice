package cn.provider.mapper;

import cn.provider.entity.floorarea;

public interface floorareaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(floorarea record);

    int insertSelective(floorarea record);

    floorarea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(floorarea record);

    int updateByPrimaryKey(floorarea record);
}