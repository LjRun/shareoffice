package cn.provider.mapper;

import cn.provider.entity.garden;

public interface gardenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(garden record);

    int insertSelective(garden record);

    garden selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(garden record);

    int updateByPrimaryKey(garden record);
}