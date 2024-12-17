package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Fan {
    public int id;
    public String brandName;
    public int speedSettings;
    public int numberOfBlades;
    public void fanDetails(){
        System.out.println("the fan will give the air");
    }


}
