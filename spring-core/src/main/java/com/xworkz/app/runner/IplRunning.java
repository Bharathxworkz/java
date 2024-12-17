package com.xworkz.app.runner;

import com.xworkz.app.Ipl.Frachise;
import com.xworkz.app.Ipl.Ipl;
import com.xworkz.app.configure.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IplRunning {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Ipl ipl=applicationContext.getBean(Ipl.class);
        Frachise frachise =ipl.frachise;
        System.out.println("The franchise name :"+frachise.FranchiseNmae);
    }
}