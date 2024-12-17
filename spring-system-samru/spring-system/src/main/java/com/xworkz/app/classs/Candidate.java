package com.xworkz.app.classs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Candidate {
    @Value("Raksha shetty")
    private String candidateName;
    public void getCandidateDetails(){
        System.out.println("Candidate name is " + candidateName);
    }
}
