package com.xworkz.patientapp.country;

import com.xworkz.patientapp.state.State;

public class Country {
    public String CountryName;
              State state;

                   public  Country(State state){
                      this.state=state;

                   }



    public void getCountryDetails() {
        System.out.println("The patient country"+this.CountryName);
                       this.state.statedetails();


    }
}
