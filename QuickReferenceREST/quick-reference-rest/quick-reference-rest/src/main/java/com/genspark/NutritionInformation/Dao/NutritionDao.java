package com.genspark.NutritionInformation.Dao;

import com.genspark.NutritionInformation.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionDao extends JpaRepository<Food, Integer> {
}
