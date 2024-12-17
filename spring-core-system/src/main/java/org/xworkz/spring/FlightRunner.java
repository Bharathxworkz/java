package org.xworkz.spring;

import org.xworkz.spring.configuration.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Flight flight = applicationContext.getBean(Flight.class);
         flight.FlifhtID=1;
       flight.FlifhtName="Vikranth";
    String Name =   applicationContext.getBean(String.class);
      int FligthNumber =  applicationContext.getBean(int.class);
       Long pilotNumber    = applicationContext.getBean(long.class);
     Float height  =  applicationContext.getBean(float.class);
     double price = applicationContext.getBean(double.class);
     List <String> list =applicationContext.getBean("getStopName",List.class);
      List<Integer> list1 =applicationContext.getBean("stopNumber",List.class);

        System.out.println(pilotNumber);
        System.out.println(Name);
        System.out.println(FligthNumber);
        System.out.println(height);
        System.out.println(flight);
        System.out.println(price);
        System.out.println(list);
        System.out.println(list1);

    }
}
