package org.xworkz.spring.patientapp.address;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.patientapp.country.Country;
@Component
public class Address {

         @Autowired
        public Country country;

          public Address(Country country){
             this.country=  country;
          }

         public void getAddressDetails(){
              this.country.getCountryDetails();
          }

}
