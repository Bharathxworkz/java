package com.xworkz.app.policestation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class PoliceStation {
    @Autowired
    public Police police;

    @Value("Rajajinagar police station")
    private String policeStationName;

    public PoliceStation(Police police){
        this.police=police;
    }
    public void getPoliceStationDetails(){
        System.out.println("Police Station name is " + policeStationName );
        police.getPoliceDetails();
    }

}
