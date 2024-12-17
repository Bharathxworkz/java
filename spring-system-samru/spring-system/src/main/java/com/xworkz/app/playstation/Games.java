package com.xworkz.app.playstation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Games {
    @Value("Pubg")
    private String gameName;
    public void getGamesDetails(){
        System.out.println("Game name is " + gameName);
    }
}
