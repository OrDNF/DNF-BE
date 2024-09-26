package com.example.danafood.repository;

import com.example.danafood.model.DeliveryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryStatusRepo extends JpaRepository<DeliveryStatus, Long> {
}
