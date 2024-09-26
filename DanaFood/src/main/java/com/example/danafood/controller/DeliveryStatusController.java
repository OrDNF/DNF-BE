package com.example.danafood.controller;

import com.example.danafood.service.DeliveryStatus.IDeliveryStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
public class DeliveryStatusController {
    @Autowired
    private IDeliveryStatusService deliveryStatusService;
}
