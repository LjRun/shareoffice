package cn.provider.service;

import cn.provider.entity.user;
import cn.provider.model.UserModel;
import cn.provider.model.common.CommonModel;
import cn.provider.model.request.UserUpdateRequest;
import cn.provider.model.response.UserInfoReponse;
import cn.provider.model.response.UserUpdatePwdRequest;

public interface IUserService {
    user getUser(UserModel model);

    boolean setUser(Integer uid,String token);

    CommonModel<UserInfoReponse> getUser(Integer uid);

    CommonModel<String> setUser(UserUpdateRequest model);

    CommonModel<String> updateUserPwd(UserUpdatePwdRequest req);
}
