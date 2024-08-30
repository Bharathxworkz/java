package com.xoworkz.pizzaapp.pizza;

public class Pizza {
    private int pizzaID;
    private  String pizzaNae;
    private  double price;
    private  char size;

    @Override
    public String toString() {
        return "The details of pizza(the id pizza:"+this.pizzaID+","+
        "The name of Pizza:"+this.pizzaNae+","+
        "the price of pizza:"+this.price+","+
        "thse size of pizza:"+this.size+")";
    }

    public void setPizzaID(int pizzaID) {
        this.pizzaID = pizzaID;
    }

    public int getPizzaID() {
        return pizzaID;
    }

    public void setPizzaNae(String pizzaNae) {
        this.pizzaNae = pizzaNae;
    }

    public String getPizzaNae() {
        return pizzaNae;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }
}
