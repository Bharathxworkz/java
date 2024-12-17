package com.xworkz.app.tamilnadu;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Kaveri {
    @Value("ThalaKaveri")
    private String startingPoint;
    public void getKaveryDetails(){
        System.out.println("Kavery starting point is " + startingPoint);
    }
}
