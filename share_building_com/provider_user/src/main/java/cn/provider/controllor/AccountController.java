package cn.provider.controllor;


import cn.provider.entity.user;
import cn.provider.model.UserModel;
import cn.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IUserService iUserService;


    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public user getUserInfo() {
        return iUserService.getUser(new UserModel(1,null,null));
    }
}
