package cn.provider.entity;

import java.math.BigDecimal;
import java.util.Date;

public class workorder {
    private Integer id;

    private Integer addclientuserid;

    private Integer dispatchuserid;

    private Integer departmentid;

    private Integer recipientuserid;

    private String workordertypeencoding;

    private String code;

    private String details;

    private Date applytime;

    private String servecompany;

    private String contactman;

    private String contactphone;

    private String address;

    private Integer workorderstate;

    private Integer isautosendorder;

    private Integer ishangup;

    private Date statetime;

    private String stateremark;

    private Integer customerfeedbackstar;

    private String customerappraisal;

    private String customersignature;

    private BigDecimal laborcosts;

    private BigDecimal materialfee;

    private String dealresult;

    private BigDecimal allcost;

    private Float totaltimeconsuming;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddclientuserid() {
        return addclientuserid;
    }

    public void setAddclientuserid(Integer addclientuserid) {
        this.addclientuserid = addclientuserid;
    }

    public Integer getDispatchuserid() {
        return dispatchuserid;
    }

    public void setDispatchuserid(Integer dispatchuserid) {
        this.dispatchuserid = dispatchuserid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getRecipientuserid() {
        return recipientuserid;
    }

    public void setRecipientuserid(Integer recipientuserid) {
        this.recipientuserid = recipientuserid;
    }

    public String getWorkordertypeencoding() {
        return workordertypeencoding;
    }

    public void setWorkordertypeencoding(String workordertypeencoding) {
        this.workordertypeencoding = workordertypeencoding == null ? null : workordertypeencoding.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
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
        this.servecompany = servecompany == null ? null : servecompany.trim();
    }

    public String getContactman() {
        return contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman == null ? null : contactman.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getWorkorderstate() {
        return workorderstate;
    }

    public void setWorkorderstate(Integer workorderstate) {
        this.workorderstate = workorderstate;
    }

    public Integer getIsautosendorder() {
        return isautosendorder;
    }

    public void setIsautosendorder(Integer isautosendorder) {
        this.isautosendorder = isautosendorder;
    }

    public Integer getIshangup() {
        return ishangup;
    }

    public void setIshangup(Integer ishangup) {
        this.ishangup = ishangup;
    }

    public Date getStatetime() {
        return statetime;
    }

    public void setStatetime(Date statetime) {
        this.statetime = statetime;
    }

    public String getStateremark() {
        return stateremark;
    }

    public void setStateremark(String stateremark) {
        this.stateremark = stateremark == null ? null : stateremark.trim();
    }

    public Integer getCustomerfeedbackstar() {
        return customerfeedbackstar;
    }

    public void setCustomerfeedbackstar(Integer customerfeedbackstar) {
        this.customerfeedbackstar = customerfeedbackstar;
    }

    public String getCustomerappraisal() {
        return customerappraisal;
    }

    public void setCustomerappraisal(String customerappraisal) {
        this.customerappraisal = customerappraisal == null ? null : customerappraisal.trim();
    }

    public String getCustomersignature() {
        return customersignature;
    }

    public void setCustomersignature(String customersignature) {
        this.customersignature = customersignature == null ? null : customersignature.trim();
    }

    public BigDecimal getLaborcosts() {
        return laborcosts;
    }

    public void setLaborcosts(BigDecimal laborcosts) {
        this.laborcosts = laborcosts;
    }

    public BigDecimal getMaterialfee() {
        return materialfee;
    }

    public void setMaterialfee(BigDecimal materialfee) {
        this.materialfee = materialfee;
    }

    public String getDealresult() {
        return dealresult;
    }

    public void setDealresult(String dealresult) {
        this.dealresult = dealresult == null ? null : dealresult.trim();
    }

    public BigDecimal getAllcost() {
        return allcost;
    }

    public void setAllcost(BigDecimal allcost) {
        this.allcost = allcost;
    }

    public Float getTotaltimeconsuming() {
        return totaltimeconsuming;
    }

    public void setTotaltimeconsuming(Float totaltimeconsuming) {
        this.totaltimeconsuming = totaltimeconsuming;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}