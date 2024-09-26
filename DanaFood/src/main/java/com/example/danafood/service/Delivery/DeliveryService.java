package com.example.danafood.service.Delivery;

import com.example.danafood.repository.IDeliveryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService implements IDeliveryService {
    @Autowired
    private IDeliveryRepo iDeliveryRepo;
}
