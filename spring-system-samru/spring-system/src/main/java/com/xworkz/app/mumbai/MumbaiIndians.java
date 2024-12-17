package com.xworkz.app.mumbai;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MumbaiIndians {
    @Autowired
    public AmbaniGroups ambaniGroups;

    @Value("Mumbai")
    private String city;

    public MumbaiIndians(AmbaniGroups ambaniGroups){
        this.ambaniGroups= ambaniGroups;
    }
    public void getMumbaiIndiansDetails(){
        System.out.println("Mumbai Indians city is " + city);
        ambaniGroups.getAmbaniGroupsDetails();
    }
}
