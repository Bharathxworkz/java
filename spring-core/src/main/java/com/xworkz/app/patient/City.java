package com.xworkz.app.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {


    public  Area area ;
     @Value("Bengaluru")
    public String cityName;


    public City(Area area){

        this.area = area;
    }


    public  void getCityDetails(){
        System.out.println("The Area name is :"+ this.cityName);
        this.area.getAreadetails();
    }

}
