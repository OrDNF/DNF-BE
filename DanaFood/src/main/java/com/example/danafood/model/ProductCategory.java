package com.example.danafood.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(50)")
    @NotBlank(message = "Category not blank!")
    private String name;

    public ProductCategory() {
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
