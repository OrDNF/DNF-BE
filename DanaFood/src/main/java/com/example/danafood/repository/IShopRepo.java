package com.example.danafood.repository;

import com.example.danafood.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IShopRepo extends JpaRepository<Shop, Long> {
}
