package com.xworkz.patientapp.hospital;

import com.xworkz.patientapp.patientdetails.Patient;
public class Hospital {
    public static String cityName;
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
    public void admission(Hospital hos){
        System.out.println("patient is admitted in" + hos.getClass().getSimpleName());
    }


}
