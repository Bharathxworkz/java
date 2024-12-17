package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Charger {
    public String brandName;
    public String connectivityTechnology;
    public String colour;
    public double price;

    public void getChargerDetails(){
        System.out.println("the Charger will having different prices");
    }
}
