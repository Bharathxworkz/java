package com.zomato.foodapp.restaurant;

import com.zomato.foodapp.food.FoodItem;

public class Restaurant {
    public String name;
    public String location;
    public FoodItem foodItem;

    public boolean addFoodItem(FoodItem foodItem) {
        boolean isAdded = false;

        if (foodItem != null) {
            this.foodItem = foodItem;
            this.foodItem.displayDetails();
            isAdded = true;
            System.out.println("Food item added to the menu.");
        } else {
            System.out.println("No food item provided.");
        }
        return isAdded;
    }
}
