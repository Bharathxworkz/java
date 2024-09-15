package com.xworkz.travelapp;

import com.xworkz.travelapp.agency.TravelAgency;
import com.xworkz.travelapp.contract.RedbusContract;
import com.xworkz.travelapp.srs.SrsImpl;
import com.xworkz.travelapp.vrl.VrlImpl;

public class TravelRunner {

    public static void main(String[] args){

        System.out.println("main started");


        TravelAgency travelAgency = new TravelAgency();
       // RedbusContract contract = new VrlImpl();
        //RedbusContract contract = null;
        // travelAgency.booking(contract);

        VrlImpl vrl = new VrlImpl();
        travelAgency.booking(vrl);


        TravelAgency travelAgency1 = new TravelAgency();
        RedbusContract contract1 = new SrsImpl();
        travelAgency.booking(contract1);

        System.out.println("main ended");
    }
}
