package com.xworkz.app.mumbai;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class AmbaniGroups {
    @Value("Ambani")
    private String name;
    public void getAmbaniGroupsDetails(){
        System.out.println("Ambani groups name is " + name);
    }
}
