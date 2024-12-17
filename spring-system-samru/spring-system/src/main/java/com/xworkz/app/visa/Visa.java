package com.xworkz.app.visa;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Visa {
    @Autowired
    public Passport passport;

    public void Visa(Passport passport){
        this.passport=passport;
    }
    @Value("India")
    private String place;

    public void getVisaDetails(){
        System.out.println("Visa place applied for " +  place);
        passport.getPassportDetails();
    }
}
