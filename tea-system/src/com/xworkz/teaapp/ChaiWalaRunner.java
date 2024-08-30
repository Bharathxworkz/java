package com.xworkz.teaapp;

import com.xworkz.teaapp.chaipoint.ChaiWala;

public class ChaiWalaRunner {
    public static void main(String[] args) {
        ChaiWala chaiWala = new ChaiWala();
        chaiWala.setChaID(1);
        chaiWala.setChaiName("Amabri Chai");
        chaiWala.setPrice(20.0);
        chaiWala.setChaiType("Ginger");
        chaiWala.setQantity("40Ml");
        ChaiWala chaiWala1 = new ChaiWala();
        //parsing one refrence object to another
       // chaiWala1=chaiWala;
        chaiWala =chaiWala1;

        chaiWala1.setChaID(2);
        chaiWala1.setChaiName("Malgudi Chai");
        chaiWala1.setPrice(12.0);
        chaiWala1.setChaiType("lemon");
        chaiWala1.setQantity("40Ml");

        System.out.println("the details of Chai"+chaiWala);
        System.out.println("the details of Chai"+chaiWala1);

       // boolean isEqual = chaiWala.equals(chaiWala1);
        //System.out.println(isEqual);
    }

}
