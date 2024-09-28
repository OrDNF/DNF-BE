package com.example.danafood.dto;

import com.example.danafood.model.OrderStatus;
import com.example.danafood.model.Orders;
import com.example.danafood.model.PaymentMethod;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class OrderDetailDto {
    private Long id;

    private Integer productAmount;

    private Orders order;

    private PaymentMethod paymentMethod;

    private OrderStatus orderStatus;

    public OrderDetailDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
