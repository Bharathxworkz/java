package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Area {

   // @Autowired
  //  @Value("Vijaynagara")
    public String areaName;
//@Value("Hosalli ")
    public   String streetName;
//    @Value("24")
    public int streetNo;

    public  void getAreadetails()
    {
        System.out.println("The area Name:"+areaName);
        System.out.println("The stretName:" + streetName);
        System.out.println("the streetNo:"+ streetNo);
    }
}
