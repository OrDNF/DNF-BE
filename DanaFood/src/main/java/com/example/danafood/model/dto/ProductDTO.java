package com.example.danafood.model.dto;

import com.example.danafood.model.OrderDetail;
import com.example.danafood.model.ProductCategory;
import com.example.danafood.model.Shop;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductDTO implements Validator {

    @NotBlank(message = "Product name cannot be blank")
    @Size(max = 50, message = "Product name must not exceed 50 characters")
    @Size(min = 3, message = "Product name must be at least 3 characters")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Product name must not contain special characters")
    private String productName;

    @NotNull(message = "Price cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private Double price;

    @Size(max = 255, message = "Description must not exceed 255 characters")
    private String description;

    @Size(max = 255, message = "Image URL must not exceed 255 characters")
    private String image;

    @NotNull(message = "Product category cannot be null")
    @Positive(message = "Product category must be a positive number")
    private Long productCategory;

    @Positive(message = "Order detail must be a positive number")
    private Long orderDetail;

    @NotNull(message = "Shop cannot be null")
    @Positive(message = "Shop must be a positive number")
    private Long shop;

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

    public Long getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
    }

    public Long getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(Long orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Long getShop() {
        return shop;
    }

    public void setShop(Long shop) {
        this.shop = shop;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
