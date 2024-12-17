package com.xworkz.app.visa;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Passport {
    @Value("Raksha Shetty")
    private String name;

    public void getPassportDetails(){
        System.out.println("Passport member name is " + name);

    }
}
