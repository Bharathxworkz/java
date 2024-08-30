package com.xworkz.patientapp;

import com.xworkz.patientapp.address.Address;
import com.xworkz.patientapp.area.Area;
import com.xworkz.patientapp.bloodgroup.BloodGroup;
import com.xworkz.patientapp.city.City;
import com.xworkz.patientapp.constant.Gender;
import com.xworkz.patientapp.country.Country;
import com.xworkz.patientapp.hospital.Hospital;
import com.xworkz.patientapp.patientdetails.Patient;
import com.xworkz.patientapp.state.State;

import static com.xworkz.patientapp.bloodgroup.BloodGroup.BPOSITIVE;
import static com.xworkz.patientapp.bloodgroup.BloodGroup.OPOSITIVE;

import static com.xworkz.patientapp.constant.Gender.MAlE;

public class PatientRunner {
    public static void main(String[] args) {

        Area area = new Area();
        area.areaName = "Hebbala";
        area.streetNo = 143;
        area.streetName = "Anandnagar";

        City city = new City(area);
        city.cityName = "Bangalore";

        State state = new State(city);
        state.stateName = "Karnataka";

        // Creating Country object with State
        Country country = new Country(state);
        country.CountryName = "India";

        // Creating Address object with Country
        Address address = new Address(country);

        Patient patient = new Patient(address);
        patient.name = "Bharath L";
        patient.age = "21";
        patient.disease = "Diet";
        patient.gender = MAlE ;
        patient.bloodGroup = OPOSITIVE.name();// Corrected assignment

        Hospital hospital = new Hospital();
        hospital.admission(hospital);
        Hospital.cityName = "Bangalore";

        Hospital hospital1 = new Hospital();
        System.out.println("-----------------" + hospital1.cityName);

        Hospital hospital2 = new Hospital();
        System.out.println("-----------------" + hospital2.cityName);

        patient.getPatientDetailsAndAddress();
    }
}
