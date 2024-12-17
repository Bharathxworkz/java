package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

// public  String Address;

    public  Country country;

    public Address(Country country){
        this.country=  country;
    }

    public void getAddressDetails(){
        this.country.getCountryDetails();
//        System.out.println(Address);
    }
}
