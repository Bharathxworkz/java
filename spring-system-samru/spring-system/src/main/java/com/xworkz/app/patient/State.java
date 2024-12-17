package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class State {
   // @Autowired
    public City city;
  //  @Value("Karnataka")
    public String stateName;
    public State(City city){
        this.city = city;
    }

    public void printCity(){

        this.city.printArea();
        System.out.println("The state name is " + this.stateName);
    }
}
