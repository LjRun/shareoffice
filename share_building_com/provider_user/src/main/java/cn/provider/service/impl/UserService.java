package cn.provider.service.impl;

import cn.provider.entity.user;
import cn.provider.mapper.userMapper;
import cn.provider.model.UserModel;
import cn.provider.model.common.CommonModel;
import cn.provider.model.common.StateCode;
import cn.provider.model.request.UserUpdateRequest;
import cn.provider.model.response.UserInfoReponse;
import cn.provider.model.response.UserUpdatePwdRequest;
import cn.provider.service.IUserService;
import cn.provider.util.StringUtil;
import cn.provider.util.redis.RedisKey;
import cn.provider.util.redis.impl.RedisService;
import com.sun.tools.classfile.StackMapTable_attribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;
import javax.annotation.Resource;
import java.text.MessageFormat;

@Service
public class UserService implements IUserService {

    @Autowired(required = false)
    private userMapper _userMapper;


    @Resource
    private RedisService redisService;

    @Override
    public user getUser(UserModel model) {
        user us = _userMapper.selectUserInfo(model);
        return us;
    }

    @Override
    public boolean setUser(Integer uid,String token){
        try {
            String key= MessageFormat.format(RedisKey.userTolen,uid);
            redisService.set(key,token);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public CommonModel<UserInfoReponse> getUser(Integer uid) {
        if (uid == null || uid.intValue() == 0) {
            return new CommonModel<UserInfoReponse>("uid不能为空", 0, StateCode.KnownError, null);
        }
        user us = _userMapper.selectByPrimaryKey(uid);
        if (us == null) {
            return new CommonModel<UserInfoReponse>("用户不存在", 0, StateCode.KnownError, null);
        }
        CommonModel<UserInfoReponse> res = new CommonModel<UserInfoReponse>();
        res.setResult(new UserInfoReponse(uid, us.getAvatar(), us.getUsername(), us.getSex(), us.getLoginkey(), "软件部"));
        return res;
    }

    @Override
    public CommonModel<String> setUser(UserUpdateRequest model) {
        if (model.getUid() == null || model.getUid().intValue() == 0) {
            return new CommonModel<String>("uid不能为空", 0, StateCode.KnownError, null);
        }
        user us = new user();
        us.setAvatar(model.getAvtor());
        us.setSex(model.getSex());
        boolean result = _userMapper.updateByPrimaryKeySelective(us) > 0;
        if (result) {
            return new CommonModel<String>("更新成功", 1, StateCode.Success, null);
        }
        return new CommonModel<String>("操作失败", 0, StateCode.KnownError, null);
    }

    @Override
    public CommonModel<String> updateUserPwd(UserUpdatePwdRequest req) {
        if (req.getUid() == null || req.getUid().intValue() == 0) {
            return new CommonModel<String>("uid不能为空", 1, StateCode.Success, null);
        }
        if (StringUtil.IsNullOrEmpty(req.getNewPwd())||StringUtil.IsNullOrEmpty(req.getOldPwd())) {
            return new CommonModel<String>("密码不能为空", 1, StateCode.Success, null);
        }
        user us=_userMapper.selectByPrimaryKey(req.getUid());
        String password = StringUtil.getMD5(us.getLoginkey() + req.getOldPwd());
        if (!password.equals(us.getLoginpassword())) {
            return new CommonModel<>("密码错误", 0, StateCode.KnownError, null);
        }
        //生成的新密码
        String pwd = StringUtil.getMD5(us.getLoginkey() + req.getOldPwd());
        user userModel=new user();
        userModel.setId(us.getId());
        userModel.setLoginpassword(pwd);
        boolean result = _userMapper.updateByPrimaryKeySelective(us) > 0;
        if (result) {
            return new CommonModel<String>("修改成功", 1, StateCode.Success, null);
        }
        return new CommonModel<String>("操作失败", 0, StateCode.KnownError, null);
    }
}
