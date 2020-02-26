package com.jlt.jcart.adminstration.back.dto.out;

public class OrderListOutDTO {

    private Integer orderId;
    private Integer customerId;
    private String  customerName;
    private byte status;
    private double totalPirce;
    private long createTimestamp;
    private long updateTimestamp;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public double getTotalPirce() {
        return totalPirce;
    }

    public void setTotalPirce(double totalPirce) {
        this.totalPirce = totalPirce;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}
