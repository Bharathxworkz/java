package com.xworkz.app.moon;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Moon {
    @Autowired
    public Sun sun;

    @Value("White")
    private String moonColor;

    public Moon(Sun sun){
        this.sun= sun;
    }

    public void getMoonDetails(){
        System.out.println("Moon color is " +moonColor);
        sun.getSunDetails();
    }
}
