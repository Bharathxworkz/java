package com.xworkz.laptopapp.laptop;

import com.xworkz.laptopapp.motherboard.Motherboard;

public class Laptop {
    public String brand;
    public String model;
    public Motherboard motherboard;

    public boolean setMotherboard(Motherboard motherboard) {
        boolean isSet = false;

        if (this.motherboard == null) {
            if (motherboard != null) {
                this.motherboard = motherboard;
                this.motherboard.displayDetails();
                isSet = true;
                System.out.println("Motherboard is set. Proceed to configure the laptop.");
            } else {
                System.out.println("No motherboard provided.");
            }
        } else {
            System.out.println("Motherboard is already set.");
        }
        return isSet;
    }
}
