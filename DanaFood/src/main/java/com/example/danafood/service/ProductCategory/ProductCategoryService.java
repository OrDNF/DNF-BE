package com.example.danafood.service.ProductCategory;

import com.example.danafood.repository.IProductCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService implements IProductCategoryService {
    @Autowired
    private IProductCategoryRepo iProductCategoryRepo;
}
