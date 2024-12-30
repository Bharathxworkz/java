package org.xworkz.jdbc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.xworkz.jdbc.")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("SprinfConfiguration Started");
    }

}
