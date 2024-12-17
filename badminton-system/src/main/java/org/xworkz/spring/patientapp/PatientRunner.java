package org.xworkz.spring.patientapp;

import org.springframework.stereotype.Component;
import org.xworkz.spring.patientapp.address.Address;
import org.xworkz.spring.patientapp.area.Area;
import org.xworkz.spring.patientapp.city.City;
import org.xworkz.spring.patientapp.country.Country;
import org.xworkz.spring.patientapp.hospital.Hospital;
import org.xworkz.spring.patientapp.patientdetails.Patient;
import org.xworkz.spring.patientapp.state.State;

import static org.xworkz.spring.patientapp.bloodgroup.BloodGroup.OPOSITIVE;
import static org.xworkz.spring.patientapp.constant.Gender.MAlE;

@Component
public class PatientRunner {
    public static void main(String[] args) {

        Area area = new Area();
      /*  area.areaName = "Hebbala";*/
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
