package com.example.danafood.controller;

import com.example.danafood.service.ProductCategory.IProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class ProductCategoryController {
    @Autowired
    private IProductCategoryService productCategoryService;
}
