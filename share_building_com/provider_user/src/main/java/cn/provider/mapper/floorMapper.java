package cn.provider.mapper;

import cn.provider.entity.floor;

public interface floorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(floor record);

    int insertSelective(floor record);

    floor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(floor record);

    int updateByPrimaryKey(floor record);
}