package com.xworkz.app.Bank;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Manager {
    @Value("Mayank")
    public String ManagerName;

    public void get(){
        System.out.println("Manager name :"+ManagerName);
    }


}
