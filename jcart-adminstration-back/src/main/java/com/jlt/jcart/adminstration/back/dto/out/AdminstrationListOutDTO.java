package com.jlt.jcart.adminstration.back.dto.out;

public class AdminstrationListOutDTO {

    private Integer adminstratorId;
    private String username;
    private Byte status;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
