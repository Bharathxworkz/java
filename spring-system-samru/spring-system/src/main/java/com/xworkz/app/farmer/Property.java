package com.xworkz.app.farmer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Property {
    @Value("20")
    private int noOfAcres;
    public void getPropertyDetails(){
        System.out.println("No of acres is " + noOfAcres);
    }
}
