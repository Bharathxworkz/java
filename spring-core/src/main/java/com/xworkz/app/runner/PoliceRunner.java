package com.xworkz.app.runner;

import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.police.PoliceStation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PoliceRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    PoliceStation policeStation =    applicationContext.getBean(PoliceStation.class);
    policeStation.getAll();
    }
}
