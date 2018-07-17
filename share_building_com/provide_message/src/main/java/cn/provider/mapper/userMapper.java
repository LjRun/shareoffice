package cn.provider.mapper;

import cn.provider.entity.user;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;

import java.util.List;

public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

}