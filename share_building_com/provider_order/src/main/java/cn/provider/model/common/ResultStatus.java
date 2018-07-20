package cn.provider.model.common;

public enum  ResultStatus {

    //失败
    FAILED(0),
    //成功
    SUCCESSFUL(1);

    private Integer value;

    ResultStatus(final Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
