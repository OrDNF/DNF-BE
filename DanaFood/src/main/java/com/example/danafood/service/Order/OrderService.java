package com.example.danafood.service.Order;

import com.example.danafood.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepo iOrderRepo;
}
