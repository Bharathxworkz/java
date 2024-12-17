package com.xworkz.app.runner;

import com.xworkz.app.Airpot.Airpot;
import com.xworkz.app.Airpot.Terminal;
import com.xworkz.app.configure.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirpotRunning {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Airpot airpot = applicationContext.getBean(Airpot.class);
      Terminal terminal=airpot.terminal;
        System.out.println(terminal.terminalname);
    }
}
