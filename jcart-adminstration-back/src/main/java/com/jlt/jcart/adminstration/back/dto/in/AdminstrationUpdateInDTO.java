package com.jlt.jcart.adminstration.back.dto.in;

public class AdminstrationUpdateInDTO {

    private Integer adminstratorId;
    private String realName;
    private String password;
    private String eamil;
    private byte status;

    public Integer getAdminstratorId() {
        return adminstratorId;
    }

    public void setAdminstratorId(Integer adminstratorId) {
        this.adminstratorId = adminstratorId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
