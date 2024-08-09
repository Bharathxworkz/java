package com.xworkz.examapp.hallticket;

public class HallTicket {
    public  String candidteName;
    public  String subject;
    public  String subjectCode;
    public  String USN;

    public void getdetails()
    {
        System.out.println("Thecandidate Name :"+ candidteName);
        System.out.println("The Subject name :"+ subject);
        System.out.println(" The Subjectcode :"+ subjectCode);
        System.out.println("The usn of candidate :" + USN);
    }

}
