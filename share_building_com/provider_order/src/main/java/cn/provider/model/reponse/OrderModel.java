package cn.provider.model.reponse;

import java.math.BigDecimal;
import java.util.Date;

public class OrderModel {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getWorkordertypeencoding() {
        return workordertypeencoding;
    }

    public void setWorkordertypeencoding(String workordertypeencoding) {
        this.workordertypeencoding = workordertypeencoding;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getServecompany() {
        return servecompany;
    }

    public void setServecompany(String servecompany) {
        this.servecompany = servecompany;
    }

    public String getContactman() {
        return contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWorkorderstate() {
        return workorderstate;
    }

    public void setWorkorderstate(Integer workorderstate) {
        this.workorderstate = workorderstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Integer id;

    private Integer departmentid;

    private String workordertypeencoding;

    private String code;

    private String details;

    private Date applytime;

    private String servecompany;

    private String contactman;

    private String contactphone;

    private String address;

    private Integer workorderstate;

    private String remark;
}
