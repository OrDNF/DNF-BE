package com.example.danafood.dto;

import com.example.danafood.model.DeliveryStatus;
import com.example.danafood.model.UserInfor;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class DeliveryDto {
    private Long id;
    private UserInfor userInfor;

    private DeliveryStatus deliveryStatus;

    public DeliveryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserInfor getUserInfor() {
        return userInfor;
    }

    public void setUserInfor(UserInfor userInfor) {
        this.userInfor = userInfor;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
