package com.example.danafood.service.Product;

import com.example.danafood.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> findALlProduct(Pageable pageable);
    void deleteProductById(Long id);
    Product addNewProduct(Product product);
}
