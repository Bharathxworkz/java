package com.xworkz.insuranceapp.healthinsurance;

import com.xworkz.insuranceapp.insurance.Insurance;

public class HealthInsurance extends Insurance {

    public HealthInsurance(){
        System.out.println("The Healthinsurance method started");
    }

    @Override
    public void claim() {
        System.out.println("claim withh premium amount 8000");
    }
}
