package com.xworkz.app.Airpot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Airpot {
    @Autowired
    public Terminal terminal;

    public Airpot(Terminal terminal) {
        this.terminal = terminal;
    }
    public  void get(){
        terminal.gettermianal();
    }
}
