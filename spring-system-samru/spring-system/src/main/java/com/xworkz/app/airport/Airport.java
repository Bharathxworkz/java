package com.xworkz.app.airport;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Airport {
   // @Autowired
    public Terminal terminal;
    @Value("Bangalore Airport")
    private String airportName;

    public Airport(Terminal terminal){
        this.terminal=terminal;
    }
    public void getAirportDetails(){
        System.out.println("Airport name is " + airportName);
        terminal.getTerminalDetails();
    }

}
