package com.xworkz.app.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "flight")
@Scope("prototype")
public class Flight {

    public Flight(){
        System.out.println("Flight object is created");
    }

    @Autowired
    public Pilot pilot;

    public int flightId;
    public  String flightName;
    public  int noOfSeats;

    public void travelAboveGroundLevel(){
        System.out.println("Travelling above ground level from Banglore");
    }


}
