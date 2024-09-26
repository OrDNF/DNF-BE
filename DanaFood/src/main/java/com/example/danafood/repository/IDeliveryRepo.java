package com.example.danafood.repository;

import com.example.danafood.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRepo extends JpaRepository<Delivery, Long> {
}
