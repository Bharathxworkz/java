package com.xworkz.app.mobile;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Mobile {
    @Autowired
    public Sim sim;

    @Value("Redmi")
    private String mobileName;

    public Mobile(Sim sim){
        this.sim=sim;
    }
    public void getMobileDetails(){
        System.out.println("Mobile Name is " + mobileName);
        sim.getSimDetails();
    }

}
