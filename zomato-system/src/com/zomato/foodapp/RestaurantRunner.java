package com.zomato.foodapp;

import com.zomato.foodapp.food.FoodItem;
import com.zomato.foodapp.restaurant.Restaurant;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.name = "Gourmet Delights";
        restaurant.location = "123 Food Street, Flavor Town";

        FoodItem foodItem = new FoodItem();
        foodItem.name = "Vegetable Stir Fry";
        foodItem.cuisine = "Chinese";
        foodItem.price = 12.99;
        foodItem.isVegetarian = true;

        restaurant.addFoodItem(foodItem);
    }
}
