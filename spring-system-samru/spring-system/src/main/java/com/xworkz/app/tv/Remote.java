package com.xworkz.app.tv;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Remote {
    @Value("40")
    private int noOfButtons;
    public void getRemoteDetails(){
        System.out.println("Remote will have " + noOfButtons + " buttons");
    }
}
