package com.xworkz.supermarketapp.supermarket;

import com.xworkz.supermarketapp.worker.Worker;

public class SuperMarket {
    public boolean isOpen;
    public Worker worker;

    public boolean hire(Worker worker) {
        boolean isHired = false;
        if (isOpen) {
            if (worker != null) {
                this.worker = worker;
                this.worker.details();
                isHired = true;
            } else {
                System.out.println("Please provide valid worker details.");
            }
        } else {
            System.out.println("Supermarket is closed.");
        }
        return isHired;
    }
}
