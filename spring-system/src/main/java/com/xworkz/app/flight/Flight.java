package com.xworkz.app.flight;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Flight {
    public  int flightId;
    public  String name;
    public  int noOfSeats;

    public void  travelAboveGroundLevel(){
        System.out.println("Travelling above ground level from banglore to goa");
    }
}
