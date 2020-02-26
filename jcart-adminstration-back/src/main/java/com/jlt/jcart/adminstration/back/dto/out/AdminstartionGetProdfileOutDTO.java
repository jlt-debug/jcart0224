package com.jlt.jcart.adminstration.back.dto.out;

public class AdminstartionGetProdfileOutDTO {
    private Integer adminstratorId;
    private String username;
    private String realName;
    private String email;
    private byte status;
    private Long createTimestamp;

    public Integer getAdminstratorId() {
        return adminstratorId;
    }

    public void setAdminstratorId(Integer adminstratorId) {
        this.adminstratorId = adminstratorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public AdminstartionGetProdfileOutDTO(Integer adminstratorId, String username, String realName, String email, byte status, Long createTimestamp) {
        this.adminstratorId = adminstratorId;
        this.username = username;
        this.realName = realName;
        this.email = email;
        this.status = status;
        this.createTimestamp = createTimestamp;
    }

}
