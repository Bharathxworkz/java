package com.xworkz.passportapp.exception;

public class NameNotFoundException extends RuntimeException{
    public NameNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
