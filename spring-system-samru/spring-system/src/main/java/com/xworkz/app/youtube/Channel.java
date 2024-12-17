package com.xworkz.app.youtube;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Channel {
    @Value("Raksha shetty")
    private String channelName;
    public void getChannelDetails(){
        System.out.println("Channel name is " + channelName );
    }
}
