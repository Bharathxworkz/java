package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Area {
    //@Autowired
    public Street street;
  //  @Value("Rajajinagar")
    public  String areaName;

    public Area(Street street){
        this.street = street;
    }


    public void printStreet(){
        this.street.streetDetails();
        System.out.println("The Area name is " + this.areaName);
    }

}
