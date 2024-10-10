package com.example.danafood.dto;

import com.example.danafood.model.OrderDetail;
import com.example.danafood.model.Product;
import com.example.danafood.model.ProductCategory;
import com.example.danafood.model.Shop;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductDto implements Validator {

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
    private ProductCategory productCategory;

    @NotNull(message = "Product OrderDetail cannot be null")
    private OrderDetail orderDetail;

    @NotNull(message = "Product Shop cannot be null")
    private Shop shop;

    public ProductDto(Product product) {
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.image = product.getImage();
        this.productCategory = product.getProductCategory();
        this.orderDetail = product.getOrderDetail();
        this.shop = product.getShop();
    }

    public ProductDto() {

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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
