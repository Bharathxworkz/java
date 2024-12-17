package org.xworkz.spring.patientapp.city;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.spring.patientapp.area.Area;
@Component
public class City {

      @Autowired
      public Area area ;
       public String cityName;


        public City(Area area){
            this.area = area;
        }


      public  void getCityDetails(){
          System.out.println("The Area name is :"+ this.cityName);
            this.area.getAreadetails();
        }


}
