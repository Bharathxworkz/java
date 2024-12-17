package org.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.xworkz.spring")
public class SpringConfiguration {
    public SpringConfiguration(){

    }
    @Bean
    public String getStringValue(){
        return "Bharath L";
    }
    @Bean
    public int getFlightNumber(){
        return 103;
    }
    @Bean
    public Long getPilotNumber(){
        return 9019633098L;
    }
    @Bean
    public Float getheight(){
        return  30000f;
    }
    @Bean
    public  double getprice(){
        return 5000.00;
    }
    @Bean
    public List<String> getStopName(){
        List list = new ArrayList();
        list.add("Bengalueu");
        list.add("Kolkata");
        list.add("Delhi");
        list.add("mumbai");
        return list;
    }
    @Bean
    public  List<Integer> stopNumber(){
        List list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(17);
        return list;

    }

}