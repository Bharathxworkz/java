package com.xworkz.app.media;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class News {

    @Value("Politics")
    private String newsName;

    public void getNewsDetails(){
        System.out.println("News name is " + newsName);
    }
}
