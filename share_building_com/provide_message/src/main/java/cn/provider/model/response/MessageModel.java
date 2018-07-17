package cn.provider.model.response;

import java.util.Date;

public class MessageModel {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Integer getOriginalid() {
        return originalid;
    }

    public void setOriginalid(Integer originalid) {
        this.originalid = originalid;
    }

    public String getMsgtitle() {
        return msgtitle;
    }

    public void setMsgtitle(String msgtitle) {
        this.msgtitle = msgtitle;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(Integer senduserid) {
        this.senduserid = senduserid;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer id;

    public String msgtype;

    public Integer originalid;

    public String msgtitle;

    public String msgcontent;

    public Date sendtime;

    public Integer senduserid;

    public Integer isread;

    public String remark;

    public  String username;
}
