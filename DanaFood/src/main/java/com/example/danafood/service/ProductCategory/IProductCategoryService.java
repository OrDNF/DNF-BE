package com.example.danafood.service.ProductCategory;

import com.example.danafood.model.ProductCategory;

import java.util.Optional;

public interface IProductCategoryService {
    Optional<ProductCategory> findById(Long id);
}
