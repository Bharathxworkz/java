package com.xworkz.app.moon;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Sun {

    @Value("Yellow")
    private String sunColor;
    public  void  getSunDetails(){
        System.out.println("Sun color is " + sunColor);
    }
}
