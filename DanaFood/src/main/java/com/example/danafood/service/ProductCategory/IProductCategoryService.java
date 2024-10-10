package com.example.danafood.service.ProductCategory;

import com.example.danafood.model.Product;
import com.example.danafood.model.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductCategoryService {
    Optional<ProductCategory> findById(Long id);
    Page<ProductCategory> findALlCategory(Pageable pageable);
    void deleteCategoryById(Long id);
    Product addNewCategory(ProductCategory category);
    Product editCategory(Long id,ProductCategory category);
}
