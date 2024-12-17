package com.xworkz.app.patient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Street {

  //  @Value("3rd main")
    public String streetName;
  //  @Value("234")
    public int streetNumber;

    public void streetDetails(){
        System.out.println("The street name is " + this.streetName);
        System.out.println("The Street Number is " + this.streetNumber);
    }
}
