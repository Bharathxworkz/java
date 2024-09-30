package com.xworkz.passportapp.exception;

public class UserIdNotFoundException extends RuntimeException{
    public UserIdNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
