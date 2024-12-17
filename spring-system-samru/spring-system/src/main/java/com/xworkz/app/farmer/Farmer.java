package com.xworkz.app.farmer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Farmer {
    @Autowired
    public Property property;

    @Value("Sinchana Shetty")
    private String farmerName;

    public Farmer(Property property){
        this.property=property;
    }
    public void getFarmerDetails(){
        System.out.println("Farmer name is " + farmerName);
        property.getPropertyDetails();
    }
}
