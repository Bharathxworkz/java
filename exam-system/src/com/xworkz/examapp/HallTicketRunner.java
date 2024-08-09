package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;
import com.xworkz.examapp.suplementaryexam.SuplementaryExan;

public class HallTicketRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
           exam.fees=1800;
           HallTicket hallTicket =new HallTicket();
           hallTicket.candidteName="Bharath L";
           hallTicket.subject = "maths";
           hallTicket.USN="1AT20CS015";
           hallTicket.subjectCode="18CS034";
          exam.allow(hallTicket);

}
}