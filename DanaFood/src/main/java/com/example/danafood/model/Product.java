package com.example.danafood.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(120)")
    private String productName;

    private Double price;

    @Column(columnDefinition = "LongText")
    private String description;

    @Column(columnDefinition = "Longtext")
    private String image;

    public Product(String productName, Double price, String description, String image, ProductCategory productCategory, OrderDetail orderDetail, Shop shop) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.image = image;
        this.productCategory = productCategory;
        this.orderDetail = orderDetail;
        this.shop = shop;
    }

    public Product(Long id, String productName, Double price, String description, String image, ProductCategory productCategory, OrderDetail orderDetail, Shop shop) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.image = image;
        this.productCategory = productCategory;
        this.orderDetail = orderDetail;
        this.shop = shop;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory productCategory;

    @ManyToOne
    @JoinColumn(name = "orderdetail_id")
    private OrderDetail orderDetail;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public Product() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
