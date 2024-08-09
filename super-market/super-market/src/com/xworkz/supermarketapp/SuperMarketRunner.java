package com.xworkz.supermarketapp;


import com.xworkz.supermarketapp.supermarket.SuperMarket;
import com.xworkz.supermarketapp.worker.Worker;


public class SuperMarketRunner {
    public static void main(String[] args) {

        SuperMarket supermarket = new SuperMarket();
        supermarket.isOpen = true;

        Worker worker =new Worker();
        worker.workerName = "Bharath L";
        worker.position = "siplyer";
        worker.salary = 4000.0f;
        worker.experienceYears = 10;

        supermarket.hire(worker);
    }

}
