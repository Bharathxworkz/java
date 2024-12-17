package com.xworkz.app.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class State {


    @Value("Karnataka")
    public   String stateName;
    public    City city;

    public State(City city){

        this.city  = city;
    }
    public void statedetails(){
        System.out.println("the City name :"+this.stateName);
        this.city.getCityDetails();
    }
}
