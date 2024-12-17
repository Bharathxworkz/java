package com.xworkz.app.Airpot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Terminal {
    @Value("nagara")
    public String terminalname;
    public void  gettermianal(){
        System.out.println("Name :"+terminalname);
    }
}
