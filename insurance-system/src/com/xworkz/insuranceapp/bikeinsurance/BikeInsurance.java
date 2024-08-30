package com.xworkz.insuranceapp.bikeinsurance;

import com.xworkz.insuranceapp.insurance.Insurance;

public class BikeInsurance extends Insurance {
    public BikeInsurance()
    {
        System.out.println("The BikeInsurance method started");

    }

    @Override
    public void claim() {
        System.out.println("claim with premium 8000");
        System.out.println("claim with premium 8000");
    }
}
