package com.xworkz.app.stock;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class Shares {

    @Value("100000")
    private int noOfShares;

    public void getSharesDetails(){
        System.out.println("No of shares is " + noOfShares);
    }
}
