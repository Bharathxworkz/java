package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class City {
  //  @Autowired
    public Area area;

  //  @Value("Bangalore")
    public String cityName;

    public City(Area area){
        this.area = area;
    }


    public void printArea(){
        this.area.printStreet();
        System.out.println("The city name is " + this.cityName);
    }

}
