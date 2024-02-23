package com.example.cardapio.controller;

import com.example.cardapio.dto.FoodGet;
import com.example.cardapio.dto.FoodRegister;
import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")   
    @GetMapping
    public List<FoodGet> getAll(){
        List<FoodGet> foodList = repository.findAll().stream().map(FoodGet::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void registerFood(@RequestBody FoodRegister data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }
}
