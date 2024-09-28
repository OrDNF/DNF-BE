package com.example.danafood.controller;

import com.example.danafood.model.Product;
import com.example.danafood.service.Product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/product")
    public Page<Product> getProducts(@RequestParam(value = "page", defaultValue = "0") int page) {
        Page<Product> products = productService.findAllProducts(PageRequest.of(page, 10));
        return products;
    }
}
