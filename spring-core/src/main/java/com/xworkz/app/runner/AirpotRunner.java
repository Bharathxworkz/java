package com.xworkz.app.runner;

import com.xworkz.app.Airpot.Airpot;
import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.patient.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirpotRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Airpot airpot = applicationContext.getBean(Airpot.class);

        airpot.get();

    }
}
