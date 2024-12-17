package com.xworkz.app.JanardhanHospital;

import com.xworkz.app.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JanardhanHospital {

@Autowired

    public boolean isAmountPaid=true;

    public boolean addPatient(Patient patient) {
        System.out.println("Child class started");
        boolean isPatientAdded=false;
        if(isAmountPaid==true) {
            this.addPatient(patient);

            isPatientAdded = true;
            System.out.println("Child class ended");
        }
        else System.out.println("Please Pay the Amount........");
        return isPatientAdded;
    }
}
