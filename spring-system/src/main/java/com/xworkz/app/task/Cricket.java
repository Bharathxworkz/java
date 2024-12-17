package com.xworkz.app.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Cricket {
    public int noOfPlayers;
    public int noOfTeams;

    public void getCricketDetails(){
        System.out.println("it is famus sports in india");
    }

}
