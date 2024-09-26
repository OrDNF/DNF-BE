package com.example.danafood.service.OrderDetail;

import com.example.danafood.repository.IOrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    private IOrderDetailRepo iOrderDetailRepo;
}
