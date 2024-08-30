package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;
import com.xworkz.examapp.suplementaryexam.SuplementaryExan;

public class HallTicketRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
           exam.fees=1800;
           HallTicket ticket =new HallTicket();
           ticket.candidteName="Bharath L";
           ticket.subject = "maths";
           ticket.USN="1AT20CS015";
           ticket.subjectCode="18CS034";
          exam.allow(ticket);
          Exam exam1=new SuplementaryExan();
          exam1.fees=300;
          exam1.allow(ticket);

}
}