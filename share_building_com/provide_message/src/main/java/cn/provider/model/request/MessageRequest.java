package cn.provider.model.request;

import cn.provider.model.common.PageRequest;

public class MessageRequest extends PageRequest {
    public Integer snedUserId;

    public String messageType;

    public Integer getSnedUserId() {
        return snedUserId;
    }

    public void setSnedUserId(Integer snedUserId) {
        this.snedUserId = snedUserId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
