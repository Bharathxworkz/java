package com.xworkz.app.ipl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class Franchise {

    @Value("Chennai Super Kings")
    private String franchiseName;

    public void getFranchiseDetails(){
        System.out.println("Franchise name is " + franchiseName);
    }
}
