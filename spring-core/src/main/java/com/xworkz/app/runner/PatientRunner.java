package com.xworkz.app.runner;

import com.xworkz.app.patient.*;

public class PatientRunner {


    public static void main(String[] args) {

        Area area = new Area();
        area.areaName = "Hebbala";
        area.streetNo = 143;
        area.streetName = "Anandnagar";


        City city = new City(area);
        city.cityName = "Banglore";


        State state = new State(city);
        state.stateName = "Karnataka";

        // Creating Country object with State
        Country country = new Country(state);
        country.CountryName = "India";

        // Creating Address object with Country
        Address address = new Address(country);


        Patient patient = new Patient(address);
        patient.name="Nidhi";
        patient.age="21";
        patient.disease="friendship";


        patient.getPatientDetailsAndAddress();
    }
}
