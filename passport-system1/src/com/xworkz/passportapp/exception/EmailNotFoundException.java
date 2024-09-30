package com.xworkz.passportapp.exception;

public class EmailNotFoundException extends RuntimeException{
    public EmailNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
