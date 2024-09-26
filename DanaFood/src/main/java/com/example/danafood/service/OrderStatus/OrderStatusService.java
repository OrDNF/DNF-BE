package com.example.danafood.service.OrderStatus;

import com.example.danafood.repository.IOrderStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusService implements IOrderStatusService {
    @Autowired
    private IOrderStatusRepo iOrderStatusRepo;
}
