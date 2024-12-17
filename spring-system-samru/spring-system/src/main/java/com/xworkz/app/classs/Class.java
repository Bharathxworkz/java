package com.xworkz.app.classs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Class {
    @Autowired
    public Candidate candidate;

    @Value("ISE")
    private String branch;

    public Class(Candidate candidate){
        this.candidate=candidate;
    }
    public void getClassDetails(){
        System.out.println("Class branch is " + branch);
        candidate.getCandidateDetails();
    }
}
