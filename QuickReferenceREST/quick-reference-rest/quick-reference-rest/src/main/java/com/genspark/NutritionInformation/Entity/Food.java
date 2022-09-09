package com.genspark.NutritionInformation.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_nutritional_info")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int calories;
    private String expirationDate;
    private double price;

    public Food() {
    }

    public Food(String name, int calories, String expirationDate, double price) {
        this.name = name;
        this.calories = calories;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
