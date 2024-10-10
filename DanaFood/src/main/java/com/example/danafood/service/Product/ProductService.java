package com.example.danafood.service.Product;

import com.example.danafood.model.Product;
import com.example.danafood.model.dto.ProductDTO;
import com.example.danafood.repository.IOrderDetailRepo;
import com.example.danafood.repository.IProductCategoryRepo;
import com.example.danafood.repository.IProductRepo;
import com.example.danafood.repository.IShopRepo;
import com.example.danafood.service.ProductCategory.IProductCategoryService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;
    @Autowired
    private IProductCategoryRepo iProductCategoryRepo;
    @Autowired
    private IShopRepo iShopRepo;
    @Autowired
    private IOrderDetailRepo iOrderDetailRepo;


    @Override
    public Page<Product> findALlProduct(Pageable pageable) {
        return iProductRepo.findAll(pageable);
    }

    @Override
    public void deleteProductById(Long id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public Product addNewProduct(ProductDTO product) {
        return iProductRepo.save(dtoToObject(product));
    }

    @Override
    public Product editProduct(Long id,@Valid ProductDTO product) {
        if (iProductRepo.existsById(id)) {
            return iProductRepo.save(dtoToObject(product));
        } else {
            throw new EntityNotFoundException("Blog with id " + id + " not found");
        }
    }

    public Product dtoToObject(ProductDTO productDTO){
        Product product1 = new Product();
        product1.setProductName(productDTO.getProductName());
        product1.setDescription(productDTO.getDescription());
        product1.setImage(productDTO.getImage());
        product1.setPrice(productDTO.getPrice());
        product1.setProductCategory(
                iProductCategoryRepo.findById(productDTO.getProductCategory())
                        .orElseThrow(() -> new NoSuchElementException("Product category not found with id: " + productDTO.getProductCategory()))
        );
        product1.setShop(
                iShopRepo.findById(productDTO.getShop())
                        .orElseThrow(() -> new NoSuchElementException("Shop not found with id: " + productDTO.getShop()))
        );

        if (productDTO.getOrderDetail() != null){
            product1.setOrderDetail(
                    iOrderDetailRepo.findById(productDTO.getOrderDetail())
                            .orElseThrow(() -> new NoSuchElementException("Order detail not found with id: " + productDTO.getOrderDetail()))
            );
        }
        return product1;
    }

    @Override
    public Page<ProductDto> findAllProducts(Pageable pageable) {
        Page<Product> products = iProductRepo.findAll(pageable);
        return products.map(product -> new ProductDto(product));
    }
}
