package cn.provider.model.response;

public class LoginResponse {
    public Integer uid;

    public String token;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoginResponse(Integer uid, String token) {
        this.uid = uid;
        this.token = token;
    }
}
