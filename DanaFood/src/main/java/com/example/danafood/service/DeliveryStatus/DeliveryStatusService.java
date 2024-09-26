package com.example.danafood.service.DeliveryStatus;

import com.example.danafood.repository.IDeliveryStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryStatusService implements IDeliveryStatusService{
    @Autowired
    private IDeliveryStatusRepo iDeliveryStatusRepo;
}
