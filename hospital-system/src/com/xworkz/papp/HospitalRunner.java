package com.xworkz.papp;

import com.xworkz.papp.hospital.Hospital;
import com.xworkz.papp.hospital.impl.Hospitalimpl;
import com.xworkz.papp.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Hospitalimpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++) {
            Patient patient = new Patient();
            System.out.println("Enter patientId");
            int patientId = scanner.nextInt();
            patient.setPatientId(patientId);

            scanner.nextLine();

            System.out.println("Enter the patient Name");
            String name = scanner.nextLine();
            patient.setPatientName(name);

            System.out.println("Enter the age of patient");
            int age = scanner.nextInt();
            patient.setAge(age);

            scanner.nextLine();

            System.out.println("Enter the patient address");
            String address = scanner.nextLine();
            patient.setAddress(address);

            hospital.addPatient(patient);
        }

        // Display patients
        hospital.getPatient();

        // Update patient age
        System.out.println("Enter patient ID to update age");
        int patientIdToUpdate = scanner.nextInt();
        System.out.println("Enter new age");
        int newAge = scanner.nextInt();
        if (hospital.updatePatientAge(patientIdToUpdate, newAge)) {
            System.out.println("Patient age updated successfully.");
        } else {
            System.out.println("Patient not found.");
        }

        // Delete patient
        System.out.println("Enter patient ID to delete");
        int patientIdToDelete = scanner.nextInt();
        if (hospital.deletePatient(patientIdToDelete)) {
            System.out.println("Patient deleted successfully.");
        } else {
            System.out.println("Patient not found.");
        }

        // Get patient name by ID
        System.out.println("Enter patient ID to get Name");
        int patientIdToGet = scanner.nextInt();
        String patientName = hospital.getPatientNameById(patientIdToGet);
        if (patientName != null) {
            System.out.println("Patient Name: " + patientName);
        } else {
            System.out.println("Patient not found.");
        }

        // Display patients again
        hospital.getPatient();
    }
}
