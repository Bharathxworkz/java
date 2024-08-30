package com.xworkz.patientapp.state;

import com.xworkz.patientapp.city.City;

public class State {

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
