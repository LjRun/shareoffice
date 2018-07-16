package cn.provider.mapper;

import cn.provider.entity.company;

public interface companyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(company record);

    int insertSelective(company record);

    company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(company record);

    int updateByPrimaryKey(company record);
}