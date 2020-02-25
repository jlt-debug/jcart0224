package com.jlt.jcart.adminsteation.back.dto.out;

public class AdminstrationShowOutDTO {

    private Integer adminstratorId;
    private String username;
    private String email;
    private String avatarUrl;
    private byte status;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
