package com.xworkz.app.hospital;


import com.xworkz.app.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {


    @Autowired
    Patient patient;

    public boolean addPatient(Patient patient) {
        System.out.println("Parent class started");
        boolean isPatientAdded = false;
        if (patient != null) {
            if (patient.name != null) {
                this.patient = patient;
                System.out.println("Patient was eligable to admit in our zone.....!!");
                isPatientAdded=true;
                System.out.println("parent class ended");
            }
        }
        return isPatientAdded;
    }
}
