package org.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xworkz.spring.configuration.SpringConfiguartion;
import org.xworkz.spring.patientapp.area.Area;
import org.xworkz.spring.patientapp.patientdetails.Patient;

public class Runner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguartion.class);
        Patient patient=applicationContext.getBean(Patient.class);
       Area area = patient.address.country.state.city.area;
        System.out.println(  area.areaName);
    }
}
