package com.xworkz.app.Bar;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Bar {
    @Autowired
    public Pivot pivot;

    @Value("Royal Wintage")
    private String barName;

    public Bar(Pivot pivot){
        this.pivot=pivot;
    }

    public void barDetails(){
        System.out.println("Bar name is " + barName);
        pivot.getPivotDetails();
    }

}
