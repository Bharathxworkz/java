package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

import javax.security.auth.Subject;
import java.security.PublicKey;

public class Exam {
    public int fees;
    public HallTicket ticket;

    public boolean allow( HallTicket ticket){
        boolean  isAllow=false;

        if(fees==fees){
            System.out.println("fees is paid ... collect your hallticket");
            if(ticket != null){
                this.ticket= ticket;
                this.ticket.getdetails();
                isAllow = true;
                System.out.println("Hall ticket is issued .. proced the exmaniation");
            }else System.out.println("No halltcket found");

        }else System.out.println("Plz pay the fess");
        return isAllow;
    }
}
