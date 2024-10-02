package com.example.danafood.repository;

import com.example.danafood.dto.ProductDto;
import com.example.danafood.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IProductRepo extends JpaRepository<Product, Long> {
    Page<ProductDto> findAllBy(Pageable pageable);
}
