package com.xworkz.app.playstation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PlayStation {
    @Autowired
    public Games games;

    @Value("Bangalore")
    private String playStationName;

    public PlayStation(Games games){
        this.games=games;
    }

    public void getPlayStationDetails(){
        System.out.println("Play station place is " + playStationName);
        games.getGamesDetails();
    }
}
