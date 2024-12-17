package com.xworkz.app.stock;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Stock {
    @Autowired
    public Shares shares;

    @Value("MetaCorp")
    private String stockName;

    public Stock(Shares shares){
        this.shares=shares;
    }
    public void getStockDetails(){
        System.out.println("The stock name is " + stockName);
        shares.getSharesDetails();
    }
}
