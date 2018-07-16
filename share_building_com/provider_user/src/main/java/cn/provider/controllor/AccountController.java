package cn.provider.controllor;


import cn.provider.entity.user;
import cn.provider.model.UserModel;
import cn.provider.model.common.CommonModel;
import cn.provider.model.common.StateCode;
import cn.provider.model.request.LoginRequest;
import cn.provider.model.response.LoginResponse;
import cn.provider.service.IUserService;
import cn.provider.util.RegexCode;
import cn.provider.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IUserService iUserService;


    //登入接口
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonModel login(@RequestBody(required = false) LoginRequest req) {

        if (StringUtil.IsNullOrEmpty(req.getAccount())) {
            return new CommonModel<String>("账号不能为空", 0, StateCode.KnownError, null);
        }
        Pattern pat = Pattern.compile(RegexCode.phoneRegex);
        Matcher m = pat.matcher(req.getAccount());
        if (!m.find()) {
            return new CommonModel<String>("账号格式不正确", 0, StateCode.KnownError, null);
        }
        user us = iUserService.getUser(new UserModel(0, req.account, null));
        if (us == null) {
            return new CommonModel<>("账号不存在", 0, StateCode.KnownError, null);
        }
        String password = StringUtil.getMD5(us.getLoginkey() + req.getPwd());
        if (!password.equals(us.getLoginpassword())) {
            return new CommonModel<>("密码错误", 0, StateCode.KnownError, null);
        }
        //设置登入token
        String token = StringUtil.GenerateGUID();
        user userModel = new user();
        userModel.setId(us.getId());
        userModel.setToken(token);
        boolean result = iUserService.setUser(userModel);
        if (result) {
            return new CommonModel<LoginResponse>("登入成功", 1, StateCode.Success, new LoginResponse(us.getId(), token));
        }
        return new CommonModel<>("系统错误", 0, StateCode.KnownError, null);
    }
}
