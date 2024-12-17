package com.xworkz.app.dubai;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class BurjKhalifa {
    @Value("163")
    private int noOfFloors;
    public void getBurjKhalifaDetails(){
        System.out.println("No of floors is " + noOfFloors);
    }
}
