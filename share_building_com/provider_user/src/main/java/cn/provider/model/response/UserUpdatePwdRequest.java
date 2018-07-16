package cn.provider.model.response;

public class UserUpdatePwdRequest {
    public Integer uid;

    public String oldPwd;

    public String newPwd;

    public UserUpdatePwdRequest(Integer uid, String oldPwd, String newPwd) {
        this.uid = uid;
        this.oldPwd = oldPwd;
        this.newPwd = newPwd;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}
