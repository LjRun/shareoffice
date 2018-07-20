package cn.provider.entity;

import java.util.Date;

public class workordertime {
    private Integer id;

    private Integer workorderid;

    private Date addtime;

    private Date customerservicereviewtime;

    private Date customerservicedispatchtime;

    private Date dutydepartaudittime;

    private Date dutydepartorderstime;

    private Date arrivespottime;

    private Date finishtime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(Integer workorderid) {
        this.workorderid = workorderid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getCustomerservicereviewtime() {
        return customerservicereviewtime;
    }

    public void setCustomerservicereviewtime(Date customerservicereviewtime) {
        this.customerservicereviewtime = customerservicereviewtime;
    }

    public Date getCustomerservicedispatchtime() {
        return customerservicedispatchtime;
    }

    public void setCustomerservicedispatchtime(Date customerservicedispatchtime) {
        this.customerservicedispatchtime = customerservicedispatchtime;
    }

    public Date getDutydepartaudittime() {
        return dutydepartaudittime;
    }

    public void setDutydepartaudittime(Date dutydepartaudittime) {
        this.dutydepartaudittime = dutydepartaudittime;
    }

    public Date getDutydepartorderstime() {
        return dutydepartorderstime;
    }

    public void setDutydepartorderstime(Date dutydepartorderstime) {
        this.dutydepartorderstime = dutydepartorderstime;
    }

    public Date getArrivespottime() {
        return arrivespottime;
    }

    public void setArrivespottime(Date arrivespottime) {
        this.arrivespottime = arrivespottime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}