package com.example.danafood.service.Shop;

import com.example.danafood.dto.ShopDto;
import com.example.danafood.model.Shop;
import com.example.danafood.repository.IShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService implements IShopService {
    @Autowired
    private IShopRepo iShopRepo;


}
