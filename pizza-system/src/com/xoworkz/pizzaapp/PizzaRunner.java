package com.xoworkz.pizzaapp;

import com.xoworkz.pizzaapp.pizza.Pizza;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza pizza= new Pizza();
        pizza.setPizzaID(12);
        pizza.setPizzaNae("Onion");
        pizza.setPrice(160.00);
        pizza.setSize('L');
        System.out.println(pizza);

        Pizza pizza1= new Pizza();
        pizza1.setPizzaID(2);
        pizza1.setPizzaNae("");
        pizza1.setPrice(40.0);
        pizza1.setSize('L');
        System.out.println(pizza1);


    }
}
