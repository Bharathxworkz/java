package com.xworkz.app.parlour;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Parlour {
    @Autowired
    public Baeutician baeutician;

    @Value("Kundapur")
    private String place;

    public Parlour(Baeutician baeutician){
        this.baeutician=baeutician;
    }
    public void getParlourDetails(){
        System.out.println("Parlour is in " + place);
        baeutician.getBeauticianDetails();
    }
}
