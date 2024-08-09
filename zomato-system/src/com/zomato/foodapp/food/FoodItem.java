package com.zomato.foodapp.food;

public class FoodItem {
    public String name;
    public String cuisine;
    public double price;
    public boolean isVegetarian;

    public void displayDetails() {
        System.out.println("Food Item Name: " + name);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Price: $" + price);
        System.out.println("Vegetarian: " + (isVegetarian ? "Yes" : "No"));
    }
}
