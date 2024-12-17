package com.xworkz.app.airport;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Setter
//@Component
public class Terminal {
    @Value("Terminal 1")
    private String terminalName;
    public  void  getTerminalDetails(){
        System.out.println("Terminal name is " + terminalName);
    }
}
