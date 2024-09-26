package com.example.danafood.repository;

import com.example.danafood.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDetailRepo extends JpaRepository<OrderDetail, Long> {
}
