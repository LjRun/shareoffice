package cn.provider.model.response;

public class UserInfoReponse {
    public Integer uid;

    public String avtor;

    public String userName;

    public Integer sex;

    public String phone;

    public String deptName;

    public UserInfoReponse(Integer uid, String avtor, String userName, Integer sex, String phone, String deptName) {
        this.uid = uid;
        this.avtor = avtor;
        this.userName = userName;
        this.sex = sex;
        this.phone = phone;
        this.deptName = deptName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
