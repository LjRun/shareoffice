package cn.provider.model.request;

import javax.print.DocFlavor;

public class LoginRequest {
    //账号
    public String account;

    //密码
    public String pwd;

    //登入类型
    public Integer type;

    //编码
    public String code;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
