package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Country {
   // @Autowired
    public State state;
   // @Value("India")
    public String countryName;
    public Country(State state){
        this.state = state;
    }

    public void printState(){
        this.state.printCity();
        System.out.println("The Country name is " + this.countryName);
    }
}
