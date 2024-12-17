package com.xworkz.app.Bar;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Pivot {

    @Value("25")
    private int pivotAge;

    public void getPivotDetails(){
        System.out.println("Pivot age is " + pivotAge);
    }

}
