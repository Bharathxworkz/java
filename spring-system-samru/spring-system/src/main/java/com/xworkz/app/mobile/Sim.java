package com.xworkz.app.mobile;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Sim {
    @Value("Airtel")
    private String simName;
    public void getSimDetails(){
        System.out.println("Sim name is " + simName);
    }
}
