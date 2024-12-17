package com.xworkz.app.runner;

import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.police.PoliceStation;
import com.xworkz.app.police.Salary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PoliceRunning {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        PoliceStation policeStation =    applicationContext.getBean(PoliceStation.class);
      Salary salary = policeStation.police.salary;
        System.out.println(salary.Salary);
        System.out.println(policeStation.policeStation);
        System.out.println(policeStation.police);
    }
}
