package com.example.danafood.service.Product;

import com.example.danafood.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<ProductDto> findAllProducts(Pageable pageable);
}
