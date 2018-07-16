package cn.provider.model;

public class UserModel {
    public int Id;

    public String LoginAccount;

    public String Token;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLoginAccount() {
        return LoginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        LoginAccount = loginAccount;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public UserModel(int id, String loginAccount, String token) {
        Id = id;
        LoginAccount = loginAccount;
        Token = token;
    }
}
