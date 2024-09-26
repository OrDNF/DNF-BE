package com.example.danafood.repository;

import com.example.danafood.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderStatusRepo extends JpaRepository<OrderStatus, Long> {
}
