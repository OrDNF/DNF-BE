package com.example.danafood.service.ProductCategory;

import com.example.danafood.model.Product;
import com.example.danafood.model.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductCategoryService {
    Optional<ProductCategory> findById(Long id);
    List<ProductCategory> findALlCategory();
    void deleteCategoryById(Long id);
    ProductCategory addNewCategory(ProductCategory category);
    ProductCategory editCategory(Long id,ProductCategory category);
}
