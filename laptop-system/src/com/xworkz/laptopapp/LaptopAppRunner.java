package com.xworkz.laptopapp;

import com.xworkz.laptopapp.laptop.Laptop;
import com.xworkz.laptopapp.motherboard.Motherboard;

public class LaptopAppRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.brand = "Dell";
        laptop.model = "XPS 15";

        Motherboard motherboard = new Motherboard();
        motherboard.brand = "ASUS";
        motherboard.model = "ROG STRIX";
        motherboard.chipset = "Intel Z490";
        motherboard.socketType = "LGA 1200";

        laptop.setMotherboard(motherboard);
    }
}
