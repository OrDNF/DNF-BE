package com.example.danafood.service.PaymentMethod;

import com.example.danafood.repository.IPaymentMethodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {
    @Autowired
    private IPaymentMethodRepo iPaymentMethodRepo;
}
