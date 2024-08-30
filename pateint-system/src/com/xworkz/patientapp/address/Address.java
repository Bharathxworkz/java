package com.xworkz.patientapp.address;

import com.xworkz.patientapp.country.Country;

public class Address {


        public  Country country;

          public Address(Country country){
             this.country=  country;
          }

         public void getAddressDetails(){
              this.country.getCountryDetails();
          }

}
