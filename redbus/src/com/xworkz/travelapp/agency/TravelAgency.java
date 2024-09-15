package com.xworkz.travelapp.agency;

import com.xworkz.travelapp.contract.RedbusContract;

public class TravelAgency {


    RedbusContract contract;

    public boolean booking(RedbusContract contract) {
        System.out.println("booking started");
        boolean isBookingDone = false;
        if (contract != null) {
            System.out.println("contract is initiated...check the bus condition");
            boolean isConditionGood = contract.busCondition();
            if (isConditionGood) {
                System.out.println("Condition is good.....process");
                this.contract = contract;
                isBookingDone = true;
            } else System.out.println("bus condition good......");
        }else System.out.println("no contact made...");

        return isBookingDone;

    }
}
