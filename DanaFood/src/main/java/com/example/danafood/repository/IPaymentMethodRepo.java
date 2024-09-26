package com.example.danafood.repository;

import com.example.danafood.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentMethodRepo extends JpaRepository<PaymentMethod, Long> {
}
