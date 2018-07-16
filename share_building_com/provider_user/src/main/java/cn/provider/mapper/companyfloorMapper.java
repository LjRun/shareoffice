package cn.provider.mapper;

import cn.provider.entity.companyfloor;

public interface companyfloorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(companyfloor record);

    int insertSelective(companyfloor record);

    companyfloor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(companyfloor record);

    int updateByPrimaryKey(companyfloor record);
}