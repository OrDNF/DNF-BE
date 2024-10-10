package com.example.danafood.service.Product;

import com.example.danafood.dto.ProductDto;
import com.example.danafood.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<ProductDto> findAllProduct(Pageable pageable);
    void deleteProductById(Long id);
    Product addNewProduct(ProductDto product);
    Product editProduct(Long id,ProductDto product);
}
