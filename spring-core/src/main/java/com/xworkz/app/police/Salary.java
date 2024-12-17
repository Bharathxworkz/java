package com.xworkz.app.police;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Value("400000")
    public int Salary;
    public void getsalary(){
        System.out.println("Salary :"+Salary);
    }
}
