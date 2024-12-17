package com.xworkz.app.tv;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class TeleVision {
    @Autowired
    public Remote remote;

    public TeleVision(Remote remote){
        this.remote=remote;
    }
    public void tvDetails(){
        remote.getRemoteDetails();
    }
}
