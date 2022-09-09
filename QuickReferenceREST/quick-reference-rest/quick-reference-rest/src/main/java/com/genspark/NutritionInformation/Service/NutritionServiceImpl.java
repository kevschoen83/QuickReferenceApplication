package com.genspark.NutritionInformation.Service;

import com.genspark.NutritionInformation.Dao.NutritionDao;
import com.genspark.NutritionInformation.Entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NutritionServiceImpl implements NutritionService {

    @Autowired
    private NutritionDao nutritionDao;

    @Override
    public List<Food> getAllFood() {
        return this.nutritionDao.findAll();
    }

    @Override
    public Food getFoodById(int id) {
        Optional<Food> f = this.nutritionDao.findById(id);
        Food food = null;

        if (f.isPresent()) {
            food = f.get();
        } else {
            throw new RuntimeException(" food not found for id :: " + id);
        }

        return food;
    }

    @Override
    public Food addFood(Food food) {
        return this.nutritionDao.save(food);
    }

    @Override
    public Food updateFood(Food food) {
        return this.nutritionDao.save(food);
    }

    @Override
    public String deleteFood(int id) {
        this.nutritionDao.deleteById(id);
        return "Food deleted successfully";
    }

}
