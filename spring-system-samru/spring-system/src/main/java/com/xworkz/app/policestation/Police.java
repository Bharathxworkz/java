package com.xworkz.app.policestation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Police {

    @Value("Constable")
    private String designation;


    public void  getPoliceDetails(){
        System.out.println("Police designation is "+designation);
    }
}
