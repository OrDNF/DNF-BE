package com.example.danafood.service.Product;

import com.example.danafood.model.Product;
import com.example.danafood.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;

    @Override
    public Page<Product> findALlProduct(Pageable pageable) {
        return iProductRepo.findAll(pageable);
    }

    @Override
    public void deleteProductById(Long id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public Product addNewProduct(Product product) {
       return iProductRepo.save(product);
    }
}
