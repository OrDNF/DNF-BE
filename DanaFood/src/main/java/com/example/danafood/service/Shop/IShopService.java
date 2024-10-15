package com.example.danafood.service.Shop;

import com.example.danafood.dto.ShopDto;
import com.example.danafood.model.ProductCategory;
import com.example.danafood.model.Shop;

import java.util.List;
import java.util.Optional;

public interface IShopService {
    Optional<Shop> findById(Long id);
    List<Shop> findALlShop();
    void deleteShopById(Long id);
    Shop addNewShop(ShopDto shop);
    Shop editShop(Long id,ShopDto shop);
}
