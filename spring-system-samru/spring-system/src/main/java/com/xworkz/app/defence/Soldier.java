package com.xworkz.app.defence;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Soldier {
    @Value("Avi")
    private String soldierName;
    public void getSoldierDetails(){
        System.out.println("Soldier name is " + soldierName);
    }
}
