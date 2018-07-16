package cn.provider.model.enums;

import org.bouncycastle.cms.PasswordRecipientId;

public enum LoginState {

    NOTLOGIN(0),

    LOGIN(1);

    private Integer value;

    LoginState(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
