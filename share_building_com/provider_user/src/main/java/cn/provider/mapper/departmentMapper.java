package cn.provider.mapper;

import cn.provider.entity.department;

public interface departmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(department record);

    int insertSelective(department record);

    department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(department record);

    int updateByPrimaryKey(department record);
}