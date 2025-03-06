package com.example.furniture_shop_app.contoller;

import com.example.furniture_shop_app.entity.FurnitureEntity;
import com.example.furniture_shop_app.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/furniture")
public class FurnitureController {

    @Autowired
    private FurnitureService furnitureService;

    @GetMapping
    public List<FurnitureEntity> getAllFurniture() {
        return furnitureService.getAllFurniture();
    }
}
