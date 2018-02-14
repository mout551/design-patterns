package com.erwan;

public class MealBuilder {

    public Meal prepareRoyalMeal(){
        Meal meal = new Meal();
        meal.addItem(new MacDeluxe());
        meal.addItem(new Coca());
        return  meal;
    }

    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new MacChicken());
        meal.addItem(new Pepsi());
        return  meal;
    }
}
