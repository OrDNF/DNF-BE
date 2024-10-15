package com.example.danafood.service.Shop;

import com.example.danafood.dto.ProductDto;
import com.example.danafood.dto.ShopDto;
import com.example.danafood.model.Product;
import com.example.danafood.model.ProductCategory;
import com.example.danafood.model.Shop;
import com.example.danafood.repository.IShopRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService implements IShopService {
    @Autowired
    private IShopRepo iShopRepo;


    @Override
    public Optional<Shop> findById(Long id) {
        return iShopRepo.findById(id);
    }

    @Override
    public List<Shop> findALlShop() {
        return iShopRepo.findAll();
    }

    @Override
    public void deleteShopById(Long id) {
        iShopRepo.deleteById(id);
    }

    @Override
    public Shop addNewShop(ShopDto shop) {
        return iShopRepo.save(dtoToObject(shop));
    }

    @Override
    public Shop editShop(Long id, ShopDto shop) {
        if (iShopRepo.existsById(id)) {
            return iShopRepo.save(dtoToObject(shop));
        } else {
            throw new EntityNotFoundException("Shop with id " + id + " not found");
        }
    }
    public Shop dtoToObject(ShopDto shopDto){
        return new Shop(shopDto.getBankNumber(), shopDto.getBankNumber(), shopDto.getShop_name(),shopDto.getUserInfor());
    }
}
