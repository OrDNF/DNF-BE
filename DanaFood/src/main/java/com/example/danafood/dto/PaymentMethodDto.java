package com.example.danafood.dto;

import jakarta.persistence.Column;

public class PaymentMethodDto {
    private Long id;
    private String methodName;

    public PaymentMethodDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
