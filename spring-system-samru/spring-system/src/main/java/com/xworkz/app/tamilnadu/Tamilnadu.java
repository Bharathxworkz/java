package com.xworkz.app.tamilnadu;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Tamilnadu {
    @Autowired
    public Kaveri kaveri;

    @Value("Chennai")
    private String capitalCity;

    public Tamilnadu(Kaveri kaveri){
        this.kaveri=kaveri;
    }
    public void getTamilNaduDetails(){
        System.out.println("Capital city is " + capitalCity);
        kaveri.getKaveryDetails();
    }

}
