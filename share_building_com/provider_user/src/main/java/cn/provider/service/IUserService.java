package cn.provider.service;

import cn.provider.entity.user;
import cn.provider.model.UserModel;
import org.springframework.stereotype.Service;

public interface IUserService {
    user getUser(UserModel model);
}
