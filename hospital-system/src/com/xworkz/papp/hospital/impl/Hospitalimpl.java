package com.xworkz.papp.hospital.impl;

import com.xworkz.papp.hospital.Hospital;
import com.xworkz.papp.patient.Patient;

public class Hospitalimpl implements Hospital {

    Patient[] patients = new Patient[1];
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        if (patient != null && patient.getPatientName() != null) {
            if (index >= patients.length) {
                // Resize array dynamically
                Patient[] newPatients = new Patient[patients.length * 2];
                System.arraycopy(patients, 0, newPatients, 0, patients.length);
                patients = newPatients;
            }
            patients[index++] = patient;
            return true;
        }
        return false;
    }

    @Override
    public void getPatient() {
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println("Patient details: " + patient);
            }
        }
    }

    @Override
    public boolean updatePatientAge(int patientId, int newAge) {
        boolean isUpdated=false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null && patients[i].getPatientId() == patientId) {
                patients[i].setAge(newAge);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public boolean deletePatient(int patientId) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null && patients[i].getPatientId() == patientId) {
                patients[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String getPatientNameById(int patientId) {

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null && patients[i].getPatientId() == patientId) {
                return patients[i].getPatientName();

            }
        }
        return null;
    }
}