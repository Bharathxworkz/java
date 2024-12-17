package com.xworkz.app.Ipl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
    @Autowired
    public Frachise frachise;
    public  Ipl(Frachise frachise){
      this.frachise =frachise;

    }
    public void getall(){
        this. frachise.get();
    }
}
