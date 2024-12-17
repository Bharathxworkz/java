package org.xworkz.spring.patientapp.janardhanhospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.patientapp.exception.PayAmountException;
import org.xworkz.spring.patientapp.patientdetails.Patient;

@Component
public class JanardhanHospital  {
    @Autowired
    Patient patient;


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
