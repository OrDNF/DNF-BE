package com.example.danafood.service.ProductCategory;

import com.example.danafood.model.ProductCategory;
import com.example.danafood.repository.IProductCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
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
}
