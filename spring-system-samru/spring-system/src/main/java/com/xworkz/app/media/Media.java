package com.xworkz.app.media;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Media {
    @Autowired
    public News news;

    public Media(News news){
        this.news=news;
    }
    @Value("TV9")
    private String mediaName;

    public void mediaDetails(){
        System.out.println("Media name is " + mediaName);
        news.getNewsDetails();
    }
}
