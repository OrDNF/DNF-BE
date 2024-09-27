package com.example.danafood.service.Product;

import com.example.danafood.model.Product;
import com.example.danafood.repository.IProductRepo;
import jakarta.persistence.EntityNotFoundException;
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

    @Override
    public Product editProduct(Long id, Product product) {
        if (iProductRepo.existsById(id)) {
            product.setId(id);
            return iProductRepo.save(product);
        } else {
            throw new EntityNotFoundException("Blog with id " + id + " not found");
        }
    }
}
