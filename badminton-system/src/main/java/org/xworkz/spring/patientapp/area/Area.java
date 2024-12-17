package org.xworkz.spring.patientapp.area;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Area {
   @Value("kalasipalyya")
   public String areaName;
  public   String streetName;
   public int streetNo;

    public  void getAreadetails()
    {
        System.out.println("The are Name:"+areaName);
        System.out.println("The streName:" + streetName);
        System.out.println("the streetNo:"+ streetNo);
    }


}
