package cn.provider.mapper;

import cn.provider.entity.message;

public interface messageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(message record);

    int insertSelective(message record);

    message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(message record);

    int updateByPrimaryKey(message record);
}