package com.example.danafood.service.Product;

import com.example.danafood.dto.ProductDto;
import com.example.danafood.model.Product;
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
    public Page<ProductDto> findAllProduct(Pageable pageable) {
        Page<Product> products = iProductRepo.findAll(pageable);
        return products.map(product -> new ProductDto(product));
    }

    @Override
    public void deleteProductById(Long id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public Product addNewProduct(ProductDto product) {
        return iProductRepo.save(dtoToObject(product));
    }

    @Override
    public Product editProduct(Long id,@Valid ProductDto product) {
        if (iProductRepo.existsById(id)) {
            return iProductRepo.save(dtoToObject(product));
        } else {
            throw new EntityNotFoundException("Blog with id " + id + " not found");
        }
    }

    public Product dtoToObject(ProductDto productDTO){
        return new Product(productDTO.getProductName(),productDTO.getPrice(),productDTO.getDescription(), productDTO.getImage(), productDTO.getProductCategory(),productDTO.getOrderDetail(),productDTO.getShop());
    }

}
