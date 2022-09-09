package com.genspark.NutritionInformation.Controller;

import com.genspark.NutritionInformation.Entity.Food;
import com.genspark.NutritionInformation.Service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NutritionController {

    @Autowired
    private NutritionService nutritionService;

    @GetMapping("/home")
    public String home() {
        return "<html><h1>Welcome to my Nutritiona Information App!</h1></html>";
    }

    @GetMapping("/food")
    public List<Food> getAllFood() {
        return this.nutritionService.getAllFood();
    }

    @GetMapping("/food/{id}")
    public Food getFoodById(@PathVariable int id) {
        return this.nutritionService.getFoodById(id);
    }

    @PostMapping("/food")
    public Food addFood(@RequestBody Food food) {
        return this.nutritionService.addFood(food);
    }

    @PutMapping("/food")
    public Food updateFood(@RequestBody Food food) {
        return this.nutritionService.updateFood(food);
    }

    @DeleteMapping("/food/{id}")
    public String deleteFood(@PathVariable int id) {
        return this.nutritionService.deleteFood(id);
    }

}

/*
    **List<Food> getAllFood();
    **Food getFoodById(int id);
    **Food addFood(Food food);
    **Food updateFood(Food food);
    **String deleteFood(int id);
*/
