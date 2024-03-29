package com.example.cardapio.dto;

import com.example.cardapio.food.Food;

public record FoodGet(Long id, String title, String image, Float price, String description) {
    public FoodGet(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice(), food.getDescription());
    }
}
