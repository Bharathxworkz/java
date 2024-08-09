package com.xworkz.patientapp.patientdetails;

import com.xworkz.patientapp.address.Address;

public class Patient {

   public String name;
   public String age;
  public   String disease;
    Address address ;

      public Patient(Address address){
           this.address      =    address;
      }
    public void getPatientDetailsAndAddress(){
        System.out.println("The name of patient:" +this.name);
        System.out.println("patient age :"+this. age);
        System.out.println("The patient suffering from :"+this.disease);
        this.address.getAddressDetails();
    }



}
