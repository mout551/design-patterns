package com.erwan;

public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal mealChicken = mealBuilder.prepareChickenMeal();
        mealChicken.ShowItems();
        System.out.println("Cout total = " + mealChicken.getCost());
    }
}
