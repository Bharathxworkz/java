package com.xworkz.app.ipl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class IPL {
    @Autowired
    public Franchise franchise;

    @Value("2024")
    private int season;

    public IPL(Franchise franchise){
        this.franchise = franchise;
    }

    public void iplDetails(){
        System.out.println("IPL season is " +season);
        franchise.getFranchiseDetails();
    }

}
