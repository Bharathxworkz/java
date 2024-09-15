package com.xworkz.teaapp.chaiWala;

public class ChaiRunner {
//polymorphism method
    public static void main(String[] args){

        ChaiWala chaiWala =new ChaiWala();
        chaiWala.setChaiId(1);
        chaiWala.setChaiName("Amruth chai");
        chaiWala.setPrice(10);
        chaiWala.setQuantity("40 ml");
        System.out.println("Your chai info is "+ chaiWala);

        ChaiWala chaiWala1 =new ChaiWala();
        //parsing one reference object to another
       // chaiWala = chaiWala1;
        chaiWala1 = chaiWala;
        chaiWala1.setChaiId(1);
        chaiWala1.setChaiName("lemon chai");
        chaiWala1.setPrice(10);
        chaiWala1.setQuantity("40 ml");
        System.out.println("Your chai info is "+ chaiWala1);

        ChaiWala chaiWala2 =new ChaiWala();
        chaiWala2.setChaiId(3);
        chaiWala2.setChaiName("lepton chai");
        chaiWala2.setPrice(10);
        chaiWala2.setQuantity("40 ml");
        System.out.println("Your chai info is "+ chaiWala2);

        ChaiWala chaiWala3 =new ChaiWala();

      //  chaiWala3 = chaiWala;
        chaiWala = chaiWala1;
        chaiWala3.setChaiId(4);
        chaiWala3.setChaiName("coffe");
        chaiWala3.setPrice(10);
        chaiWala3.setQuantity("40 ml");
        System.out.println("Your chai info is "+ chaiWala3);


        System.out.println("ChaiWala 1 hashcode value is "+ chaiWala1.hashCode());
        System.out.println("ChaiWala 2 hashcode value is "+ chaiWala1.hashCode());
      boolean isEqual = chaiWala.equals(chaiWala1);

        System.out.println(isEqual);
    }
}
