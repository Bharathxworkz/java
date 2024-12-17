package com.xworkz.app.bank;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Manager {

    @Value("Raksha Shetty")
    private String managerName;

    public void getManagerDetails(){
        System.out.println("Bank Manager name is " + managerName);
    }
}
