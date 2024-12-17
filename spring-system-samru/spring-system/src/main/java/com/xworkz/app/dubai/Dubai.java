package com.xworkz.app.dubai;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dubai {
    @Autowired
    public BurjKhalifa burjKhalifa;

    @Value("Sheikh Khalifa")
    private String name;

    public Dubai(BurjKhalifa burjKhalifa){
        this.burjKhalifa=burjKhalifa;
    }

    public void getDubaiDetails(){
        System.out.println("Name is " + name);
        burjKhalifa.getBurjKhalifaDetails();
    }
}
