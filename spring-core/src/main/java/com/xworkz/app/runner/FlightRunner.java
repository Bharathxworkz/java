package com.xworkz.app.runner;

import com.xworkz.app.flight.Flight;
import com.xworkz.app.configure.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class FlightRunner {

    public static void main(String[] args) {

        //spring container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

      Flight flight = applicationContext.getBean("flight",Flight.class);
        flight.flightId = 1;
        System.out.println(flight.flightId);

      String value = applicationContext.getBean(String.class);
        System.out.println(value);

        boolean value1 = applicationContext.getBean(boolean.class);
        System.out.println(value1);

        int value2 = applicationContext.getBean(int.class);
        System.out.println(value2);

        float value3 = applicationContext.getBean(float.class);
        System.out.println(value3);

        double value4 = applicationContext.getBean(double.class);
        System.out.println(value4);

        char value5 = applicationContext.getBean(char.class);
        System.out.println(value5);

        short value6 = applicationContext.getBean(short.class);
        System.out.println(value6);

        long value7 = applicationContext.getBean(long.class);
        System.out.println(value7);

        byte value8 = applicationContext.getBean(byte.class);
        System.out.println(value8);

        List Name = applicationContext.getBean("getListOfName", List.class);
        System.out.println(Name);

        List id = applicationContext.getBean("getListOfId",List.class);
        System.out.println(id);


    }
}
