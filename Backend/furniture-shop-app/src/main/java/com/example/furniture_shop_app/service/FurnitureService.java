package com.example.furniture_shop_app.service;

import com.example.furniture_shop_app.entity.FurnitureEntity;
import com.example.furniture_shop_app.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {

    @Autowired
    private FurnitureRepository furnitureRepository;

    public List<FurnitureEntity> getAllFurniture() {
        return furnitureRepository.findAll();
    }
}
