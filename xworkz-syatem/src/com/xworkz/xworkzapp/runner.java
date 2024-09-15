package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.trainee.Trainee;
import com.xworkz.xworkzapp.xworkz.XWorkz;
import com.xworkz.xworkzapp.xworkz.impl.XworkzImpl;

public class runner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Trainee trainee = new Trainee();
        trainee.setTraineeName("Meghana");
        trainee.setUsn("4CA1236");
        trainee.setTraineeId(12);
        trainee.setAddress("Mysore");
        trainee.setPhoneNo(9856321401l);

        XWorkz xworks = new XworkzImpl();
        xworks.trainee(trainee);
        xworks.getTraineeDetails();

        Trainee trainee1 = new Trainee();
        trainee1.setTraineeName("Myna");
        trainee1.setUsn("4CD1831");
        trainee1.setTraineeId(30);
        trainee1.setAddress("Banglore");
        trainee1.setPhoneNo(9856321408l);
        xworks.trainee(trainee1);
        xworks.getTraineeDetails();

        Trainee trainee2 = new Trainee();
        trainee2.setTraineeName("Milana");
        trainee2.setUsn("4CM18310");
        trainee2.setTraineeId(23);
        trainee2.setAddress("Mandya");
        trainee2.setPhoneNo(9856895508l);
        xworks.trainee(trainee2);
        xworks.getTraineeDetails();

        Trainee trainee3 = new Trainee();
        trainee3.setTraineeName("Meena");
        trainee3.setUsn("4CS18312");
        trainee3.setTraineeId(35);
        trainee3.setAddress("Melkote");
        trainee3.setPhoneNo(9853321408l);
        xworks.trainee(trainee3);
        xworks.getTraineeDetails();


        System.out.println("Main ended");
    }
}
