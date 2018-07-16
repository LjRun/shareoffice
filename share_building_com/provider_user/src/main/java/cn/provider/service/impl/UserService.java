package cn.provider.service.impl;

import cn.provider.entity.user;
import cn.provider.mapper.userMapper;
import cn.provider.model.UserModel;
import cn.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired(required = false)
     private userMapper _userMapper;

    @Override
    public user getUser(UserModel model) {
        user us=_userMapper.selectByPrimaryKey(model.getId());
        return us;
    }
}
