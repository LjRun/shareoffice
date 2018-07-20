package cn.provider.model.request;

public class OrderRequestA {

    public Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    //责任部门编号
    public Integer departmentId;

    //类型编码
    public String workOrderTypeEncoding;

    //工单详情
    public String details;

    //服务公司名称
    public String serveCompany;

    //联系人
    public String contactMan;

    //联系电话
    public String contactPhone;

    //服务地址
    public String address;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getWorkOrderTypeEncoding() {
        return workOrderTypeEncoding;
    }

    public void setWorkOrderTypeEncoding(String workOrderTypeEncoding) {
        this.workOrderTypeEncoding = workOrderTypeEncoding;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getServeCompany() {
        return serveCompany;
    }

    public void setServeCompany(String serveCompany) {
        this.serveCompany = serveCompany;
    }

    public String getContactMan() {
        return contactMan;
    }

    public void setContactMan(String contactMan) {
        this.contactMan = contactMan;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
