package com.xworkz.examapp.suplementaryexam;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

public class SuplementaryExan extends Exam {

    int noOfAttempts = 2;
    public  boolean allow(HallTicket ticket){
        System.out.println("The suplementary claas started");

        if(noOfAttempts>1){
            if (fees==300){
                super.ticket=ticket;
                super.ticket.getdetails();
                System.out.println("The Suplementary fees paid  ucan proceed to write an exam");
                return true;
            }


        }else System.out.println("you can't wrote an exam");
        return false;
    }
}
