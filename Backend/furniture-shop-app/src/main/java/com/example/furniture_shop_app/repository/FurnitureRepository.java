package com.example.furniture_shop_app.repository;

import com.example.furniture_shop_app.entity.FurnitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FurnitureRepository extends JpaRepository<FurnitureEntity, Long> {
}
