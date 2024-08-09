package com.xworkz.supermarketapp.worker;

import com.xworkz.supermarketapp.supermarket.SuperMarket;

public class Worker extends SuperMarket {
    public String workerName;
    public String position;
    public Float salary;
    public int experienceYears;

    public void details() {
        System.out.println("Worker Details...");
        System.out.println("Worker Name: " + workerName);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Experience Years: " + experienceYears);
    }
}
