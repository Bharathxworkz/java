package com.xworkz.papp.hospital;

import com.xworkz.papp.patient.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);

    void getPatient();

    boolean updatePatientAge(int patientId, int newAge);

    boolean deletePatient(int patientId);
    String getPatientNameById(int patientId);


}
