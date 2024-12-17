package com.xworkz.app.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Patient {
    // @Autowired
    public Address address;
   // @Value("878678567")
    public long phoneNumber;
    //@Value("Raksha Shetty")
    public String patientName;
  //  @Value("21")
    public int patientAge;
  //  @Value("123")
    public int patientId;
  //  @Value("Female")
    public String gender;
  //  @Value("AB+ve")
    public String bloodGroup;


    public Patient(Address address){
        this.address = address;
    }

    public void patientDetails(){
        System.out.println("Patient phone number is " + phoneNumber);
        System.out.println("Patient name is " + patientName);
        System.out.println("Patient age is " + patientAge);
        System.out.println("Patient ID is " + patientId);
        System.out.println("Patient gender is " + gender);
        System.out.println("Patient bloodgroup is " + bloodGroup);
        this.address.addressDetails();

    }
}
