package com.xworkz.app.fashion;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Model {
    @Value("Raksha")
    private String name;
    public void getModelDetails(){
        System.out.println("Model name is " + name);
    }
}
