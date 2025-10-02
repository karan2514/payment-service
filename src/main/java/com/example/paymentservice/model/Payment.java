package com.example.paymentservice.model;

public class Payment {
    private Long id;
    private String orderId;
    private Double amount;

    public Payment(Long id, String orderId, Double amount) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}