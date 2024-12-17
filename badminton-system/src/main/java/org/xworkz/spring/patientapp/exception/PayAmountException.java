package org.xworkz.spring.patientapp.exception;

import org.springframework.stereotype.Component;

@Component
public class PayAmountException extends RuntimeException{
    public PayAmountException(String erorMessage){

        System.out.println(erorMessage);

    }
}
