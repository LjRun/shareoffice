package cn.provider.entity;

import java.math.BigDecimal;
import java.util.Date;

public class company {
    private Integer id;

    private Integer gardenid;

    private String encoding;

    private String name;

    private Integer companytype;

    private String contactman;

    private String contactphone;

    private String legalperson;

    private Integer scale;

    private String contactaddress;

    private String companylicensenumber;

    private BigDecimal registeredassets;

    private Date startrenttime;

    private Date endrenttime;

    private Integer state;

    private String companyintroduction;

    private Date operationstime;

    private Date addtime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGardenid() {
        return gardenid;
    }

    public void setGardenid(Integer gardenid) {
        this.gardenid = gardenid;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding == null ? null : encoding.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCompanytype() {
        return companytype;
    }

    public void setCompanytype(Integer companytype) {
        this.companytype = companytype;
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

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress == null ? null : contactaddress.trim();
    }

    public String getCompanylicensenumber() {
        return companylicensenumber;
    }

    public void setCompanylicensenumber(String companylicensenumber) {
        this.companylicensenumber = companylicensenumber == null ? null : companylicensenumber.trim();
    }

    public BigDecimal getRegisteredassets() {
        return registeredassets;
    }

    public void setRegisteredassets(BigDecimal registeredassets) {
        this.registeredassets = registeredassets;
    }

    public Date getStartrenttime() {
        return startrenttime;
    }

    public void setStartrenttime(Date startrenttime) {
        this.startrenttime = startrenttime;
    }

    public Date getEndrenttime() {
        return endrenttime;
    }

    public void setEndrenttime(Date endrenttime) {
        this.endrenttime = endrenttime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCompanyintroduction() {
        return companyintroduction;
    }

    public void setCompanyintroduction(String companyintroduction) {
        this.companyintroduction = companyintroduction == null ? null : companyintroduction.trim();
    }

    public Date getOperationstime() {
        return operationstime;
    }

    public void setOperationstime(Date operationstime) {
        this.operationstime = operationstime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}