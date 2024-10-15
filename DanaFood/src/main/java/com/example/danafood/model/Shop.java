package com.example.danafood.model;

import jakarta.persistence.*;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Long id;
    @Column(columnDefinition = "varchar(25)")
    private String bankNumber;
    @Column(columnDefinition = "varchar(50)")
    private String bankName;
    @Column(columnDefinition = "varchar(150)")
    private String shop_name;

    @OneToOne
    @JoinColumn(name = "userinfor_id")
    private UserInfor userInfor;

    public Shop() {
    }

    public Shop(String bankNumber, String bankName, String shop_name, UserInfor userInfor) {
        this.bankNumber = bankNumber;
        this.bankName = bankName;
        this.shop_name = shop_name;
        this.userInfor = userInfor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public UserInfor getUserInfor() {
        return userInfor;
    }

    public void setUserInfor(UserInfor userInfor) {
        this.userInfor = userInfor;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
