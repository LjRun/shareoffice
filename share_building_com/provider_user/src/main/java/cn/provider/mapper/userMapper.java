package cn.provider.mapper;

import cn.provider.entity.user;
import cn.provider.model.UserModel;

public interface userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    user selectUserInfo(UserModel model);
}