package cn.provider.entity;

public class meetingtype {
    private Long id;

    private String rolename;

    private String roleencoding;

    private Integer isenabled;

    private Integer isEnabled;

    private String roleEncoding;

    private String roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoleencoding() {
        return roleencoding;
    }

    public void setRoleencoding(String roleencoding) {
        this.roleencoding = roleencoding == null ? null : roleencoding.trim();
    }

    public Integer getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(Integer isenabled) {
        this.isenabled = isenabled;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getRoleEncoding() {
        return roleEncoding;
    }

    public void setRoleEncoding(String roleEncoding) {
        this.roleEncoding = roleEncoding == null ? null : roleEncoding.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}