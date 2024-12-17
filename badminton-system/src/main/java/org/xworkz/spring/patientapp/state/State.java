package org.xworkz.spring.patientapp.state;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.patientapp.city.City;
@Component
public class State {

     public   String stateName;
     @Autowired
     public City city;

             public State(City city){

                this.city  = city;
             }
             public void statedetails(){
                 System.out.println("the City name :"+this.stateName);
                 this.city.getCityDetails();
             }
}
