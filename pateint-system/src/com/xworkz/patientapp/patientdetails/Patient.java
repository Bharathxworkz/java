package com.xworkz.patientapp.patientdetails;

import com.xworkz.patientapp.address.Address;
import com.xworkz.patientapp.constant.Gender;

public class Patient {
    public static String hospitalName;
    public String name;
    public String age;
    public String disease;
    public String gender;
    public String bloodGroup;  // Corrected variable name to lowercase
    Address address;

    public Patient(Address address) {
        this.address = address;
    }

    public void getPatientDetailsAndAddress() {
        System.out.println("The name of the patient: " + this.name);
        System.out.println("Patient age: " + this.age);
        System.out.println("The patient is suffering from: " + this.disease);
        System.out.println("The gender of the patient: " + this.gender);
        System.out.println("The patient blood group: " + this.bloodGroup);
        this.address.getAddressDetails();
    }
}
