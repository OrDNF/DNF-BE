package com.example.danafood.service.ProductCategory;

import com.example.danafood.model.Product;
import com.example.danafood.model.ProductCategory;
import com.example.danafood.repository.IProductCategoryRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<ProductCategory> findALlCategory() {
        return iProductCategoryRepo.findAll();
    }


    @Override
    public void deleteCategoryById(Long id) {
        iProductCategoryRepo.deleteById(id);
    }

    @Override
    public ProductCategory addNewCategory(ProductCategory category) {
        return iProductCategoryRepo.save(category);
    }

    @Override
    public ProductCategory editCategory(Long id, ProductCategory category) {
        if (iProductCategoryRepo.existsById(id)) {
            return iProductCategoryRepo.save(category);
        } else {
            throw new EntityNotFoundException("Blog with id " + id + " not found");
        }
    }


}
