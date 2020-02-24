package com.jlt.jcart.adminsteation.back.dto.in;

public class AdminstrationUpdateProfileDTO {

    private String rralName;
    private String email;
    private String avatarUrl;
    private String password;
    private byte status;

    public String getRralName() {
        return rralName;
    }

    public void setRralName(String rralName) {
        this.rralName = rralName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public AdminstrationUpdateProfileDTO(String rralName, String email, String avatarUrl, String password, byte status) {
        this.rralName = rralName;
        this.email = email;
        this.avatarUrl = avatarUrl;
        this.password = password;
        this.status = status;
    }
}
