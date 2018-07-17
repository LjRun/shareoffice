package cn.provider.entity;

import java.util.Date;

public class user {
    private Integer id;

    private Integer companyid;

    private Integer departmentid;

    private Integer roleid;

    private String username;

    private String loginaccount;

    private String loginkey;

    private String loginpassword;

    private String token;

    private String jobnumber;

    private String openid;

    private String unionid;

    private String mobile;

    private String pushregistrationid;

    private Integer sex;

    private Date birth;

    private String avatar;

    private Integer activatedstate;

    private Integer disabledstate;

    private Integer workingstate;

    private Date registertime;

    private Date updatetime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginaccount() {
        return loginaccount;
    }

    public void setLoginaccount(String loginaccount) {
        this.loginaccount = loginaccount == null ? null : loginaccount.trim();
    }

    public String getLoginkey() {
        return loginkey;
    }

    public void setLoginkey(String loginkey) {
        this.loginkey = loginkey == null ? null : loginkey.trim();
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword == null ? null : loginpassword.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber == null ? null : jobnumber.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPushregistrationid() {
        return pushregistrationid;
    }

    public void setPushregistrationid(String pushregistrationid) {
        this.pushregistrationid = pushregistrationid == null ? null : pushregistrationid.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getActivatedstate() {
        return activatedstate;
    }

    public void setActivatedstate(Integer activatedstate) {
        this.activatedstate = activatedstate;
    }

    public Integer getDisabledstate() {
        return disabledstate;
    }

    public void setDisabledstate(Integer disabledstate) {
        this.disabledstate = disabledstate;
    }

    public Integer getWorkingstate() {
        return workingstate;
    }

    public void setWorkingstate(Integer workingstate) {
        this.workingstate = workingstate;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}