package com.xworkz.patientapp.janardhanhospital;
import com.xworkz.patientapp.hospital.Hospital;
import com.xworkz.patientapp.patientdetails.Patient;
import exception.PayAmountException;

import java.util.HashMap;

public class JanardhanHospital  {
    public boolean isAmountPaid=true;

    public boolean addPatient(Patient patient) {
        System.out.println("Child class started");
        boolean isPatientAdded=false;
        if(isAmountPaid==true) {
            this.addPatient(patient);

            isPatientAdded = true;
            System.out.println("Child class ended");
        }
        else {
            PayAmountException payAmountException = new PayAmountException("plz pay the amount");
            throw payAmountException;
        }
        return isPatientAdded;
    }

}
