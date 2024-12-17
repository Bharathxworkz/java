package org.xworkz.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Flight {

    public int FlifhtID;
    public  String FlifhtName;

}
