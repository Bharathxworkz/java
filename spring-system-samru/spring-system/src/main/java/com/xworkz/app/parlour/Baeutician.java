package com.xworkz.app.parlour;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Baeutician {
    @Value("Raksha Shetty")
    private String name;
    public void getBeauticianDetails(){
        System.out.println("Name is " + name);
    }
}
