package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Kettle {
    public String brandName;
    public String  color;
    public String finishType;
    public double price;

    public void getKettleDetails(){
        System.out.println("Kettle will used boil the water");
    }
}
