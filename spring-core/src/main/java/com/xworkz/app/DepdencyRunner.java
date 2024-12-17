package com.xworkz.app;

import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.patient.Area;
import com.xworkz.app.patient.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepdencyRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Patient patient = applicationContext.getBean(Patient.class);
      //  Area area = patient.address.country.state.city.area;
        patient.getPatientDetailsAndAddress();


    }
}
