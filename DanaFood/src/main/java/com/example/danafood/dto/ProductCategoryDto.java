package com.example.danafood.dto;

import jakarta.persistence.Column;

public class ProductCategoryDto {
    private Long id;
    private String name;

    public ProductCategoryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
