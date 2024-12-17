package org.xworkz.spring.patientapp.country;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.patientapp.state.State;
@Component
public class Country {
    public String CountryName;
             @Autowired
             public State state;

                   public  Country(State state){
                      this.state=state;

                   }



    public void getCountryDetails() {
        System.out.println("The patient country:"+this.CountryName);
                       this.state.statedetails();


    }
}
