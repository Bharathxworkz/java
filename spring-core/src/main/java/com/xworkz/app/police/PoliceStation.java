package com.xworkz.app.police;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PoliceStation {
    @Value("Hosalii")
    public String policeStation;
    @Autowired
    public Police police;
    public PoliceStation(Police police){

    }
    public void getAll(){
        System.out.println("The police station :"+policeStation);
        this.police.get();
    }
}
