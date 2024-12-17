package com.xworkz.app.youtube;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class Youtube {
    @Autowired
    public Channel channel;

    @Value("English")
    private String language;

    public Youtube(Channel channel){
        this.channel=channel;
    }
    public void getYoutubeDetails(){
        System.out.println("Language is " + language);
        channel.getChannelDetails();
    }
}

