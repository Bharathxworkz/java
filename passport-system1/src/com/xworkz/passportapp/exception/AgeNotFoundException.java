package com.xworkz.passportapp.exception;

public class AgeNotFoundException extends RuntimeException{
    public AgeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
