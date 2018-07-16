package cn.provider.controllor;

import cn.provider.model.common.CommonModel;
import cn.provider.model.common.StateCode;
import cn.provider.model.request.UserUpdateRequest;
import cn.provider.model.response.UserUpdatePwdRequest;
import cn.provider.service.IUserService;
import cn.provider.util.FileUtil;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    //获取用户信息
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public CommonModel getUserInfo(@RequestParam(required = false) Integer uid) {
        return iUserService.getUser(uid);
    }

    //更新用户信息
    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.PUT)
    public CommonModel updateUserInfo(@RequestBody(required = false) UserUpdateRequest req) {
        return iUserService.setUser(req);
    }


    //上传头像
    @RequestMapping(value = "/upload")
    public CommonModel uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return new CommonModel<String>("上传文件不能为空", 0, StateCode.KnownError, null);
        }
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        String[] strArr = fileName.split("\\.");
        fileName = new Date().getTime() + "." + strArr[strArr.length - 1];
        String address = "file/avtor/app/";
        String filePath = request.getSession().getServletContext().getRealPath("/");
        try {
            //后面上传至七牛服务器
            FileUtil.uploadFile(file.getBytes(), filePath + address, fileName);
        } catch (Exception e) {
            return new CommonModel<String>("系统错误", 0, StateCode.KnownError, null);
        }
        return new CommonModel<String>("上传成功", 1, StateCode.Success, address + fileName);
    }


    //修改密码
    @RequestMapping(value = "/updatePwd", method = RequestMethod.POST)
    public CommonModel updatePwd(@RequestBody UserUpdatePwdRequest req) {
        return iUserService.updateUserPwd(req);
    }
}
