package org.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xworkz.spring.configuration.SpringConfiguartion;
import org.xworkz.spring.patientapp.area.Area;
import org.xworkz.spring.patientapp.patientdetails.Patient;

public class BadmintonRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguartion.class);

        Badminton badminton = applicationContext.getBean(Badminton.class);
        badminton.palyerNumber = 8;
        badminton.playerName = "bharath L";
       // System.out.println(badminton);

    }
}
