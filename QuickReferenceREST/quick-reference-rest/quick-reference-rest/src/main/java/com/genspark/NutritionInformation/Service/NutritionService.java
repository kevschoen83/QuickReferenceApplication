package com.genspark.NutritionInformation.Service;

import com.genspark.NutritionInformation.Entity.Food;

import java.util.List;

public interface NutritionService {

    List<Food> getAllFood();
    Food getFoodById(int id);
    Food addFood(Food food);
    Food updateFood(Food food);
    String deleteFood(int id);

}
