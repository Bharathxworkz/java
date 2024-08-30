package com.xworkz.insuranceapp;

import com.xworkz.insuranceapp.bikeinsurance.BikeInsurance;
import com.xworkz.insuranceapp.healthinsurance.HealthInsurance;
import com.xworkz.insuranceapp.insurance.Insurance;

public class InsuranceRunner {

    public static void main(String[] args) {
        Insurance insurance= new BikeInsurance();
        insurance.claim();
        Insurance insurance1 = new HealthInsurance();
        insurance1.claim();
    }
}
