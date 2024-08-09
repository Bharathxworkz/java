package com.xworkz.laptopapp.motherboard;

public class Motherboard {
    public String brand;
    public String model;
    public String chipset;
    public String socketType;

    public void displayDetails() {
        System.out.println("Motherboard Brand: " + brand);
        System.out.println("Motherboard Model: " + model);
        System.out.println("Chipset: " + chipset);
        System.out.println("Socket Type: " + socketType);
    }
}
