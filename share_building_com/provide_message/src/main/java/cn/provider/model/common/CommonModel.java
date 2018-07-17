package cn.provider.model.common;

import com.alibaba.fastjson.annotation.JSONField;

public class CommonModel<T> {

    public CommonModel(String des, int state, int resultCode, T result) {
        this.des = des;
        this.state = state;
        this.resultCode = resultCode;
        this.result = result;
    }

    public CommonModel() {

    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @JSONField(ordinal = 4, name = "state")
    private int state=1;

    @JSONField(ordinal = 3, name = "state")
    private int resultCode=StateCode.Success;

    @JSONField(ordinal = 2, name = "state")
    private String des;

    @JSONField(ordinal = 1, name = "state")
    private T result;
}
