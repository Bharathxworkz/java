package com.xworkz.app.police;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Police {
    @Value("Mudhuu")
    public String Name;
    @Autowired
    public Salary salary;
    public Police(Salary salary){
        this.salary=salary;
    }
    public void  get(){
        System.out.println("police Name:"+Name);
        this.salary.getsalary();
    }

}
