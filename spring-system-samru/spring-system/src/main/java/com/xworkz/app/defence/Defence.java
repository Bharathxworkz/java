package com.xworkz.app.defence;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Defence {
    @Autowired
    public Soldier soldier;

    @Value("Sikkim")
    private String place;

    public Defence(Soldier soldier){
        this.soldier=soldier;
    }
    public void getDefenceDetails(){
        System.out.println("Defence place is " + place);
        soldier.getSoldierDetails();
    }
}
