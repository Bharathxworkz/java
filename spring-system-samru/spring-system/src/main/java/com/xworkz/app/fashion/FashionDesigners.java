package com.xworkz.app.fashion;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class FashionDesigners {
    @Autowired
    public Model model;

    @Value("Rajajinagar")
    private String place;

    public FashionDesigners(Model model){
        this.model=model;
    }
    public void getFashionDesignersDetails(){
        System.out.println("Place is " + place);
        model.getModelDetails();
    }
}
