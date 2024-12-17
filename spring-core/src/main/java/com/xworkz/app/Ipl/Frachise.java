package com.xworkz.app.Ipl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Frachise {
    @Value("RCB")
    public  String FranchiseNmae;
    public void get(){
        System.out.println("Name :" +FranchiseNmae);
    }
}
