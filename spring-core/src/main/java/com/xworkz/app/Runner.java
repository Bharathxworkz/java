package com.xworkz.app;

import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.patient.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
      Patient patient =  applicationContext.getBean(Patient.class);
      patient.getPatientDetailsAndAddress();

    }
}
