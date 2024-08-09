package com.xworkz.patientapp.city;

import com.xworkz.patientapp.area.Area;

public class City {


        Area area ;
        String cityName;


        public City(Area area){
            this.area = area;
        }


      public  void getCityDetails(){
          System.out.println("The Area name is "+ this.cityName);
            this.area.getAreadetails();
        }


}
