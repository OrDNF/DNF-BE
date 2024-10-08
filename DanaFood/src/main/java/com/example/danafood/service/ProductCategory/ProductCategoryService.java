package com.example.danafood.service.ProductCategory;

import com.example.danafood.model.Product;
import com.example.danafood.model.ProductCategory;
import com.example.danafood.model.dto.ProductDTO;
import com.example.danafood.repository.IProductCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductCategoryService implements IProductCategoryService {
    @Autowired
    private IProductCategoryRepo iProductCategoryRepo;

    @Override
    public Optional<ProductCategory> findById(Long id) {
        return iProductCategoryRepo.findById(id);
    }

    @Override
    public Page<ProductCategory> findALlCategory(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }

    @Override
    public Product addNewCategory(ProductCategory category) {
        return null;
    }

    @Override
    public Product editCategory(Long id, ProductCategory category) {
        return null;
    }


}
