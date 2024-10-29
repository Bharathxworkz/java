package com.xworkz.jdbc.exception;

public class NameNotFoundException extends RuntimeException{
    public NameNotFoundException(String erormessage){
        System.out.println(erormessage);
    }
}
