package com.xworkz.xworkzapp.xworkz.impl;

import com.xworkz.xworkzapp.trainee.Trainee;
import com.xworkz.xworkzapp.xworkz.XWorkz;

public class XworkzImpl implements XWorkz {
    Trainee trainee;
    boolean isAdded = false;
    @Override
    public boolean trainee(Trainee trainee) {
        if(trainee != null){
            if(trainee.getTraineeName() != null) {
                System.out.println("Adding trainee to xworkz started");
                this.trainee = trainee;
                isAdded = true;
            }
            System.out.println("Adding a trainee ended");
        }else System.out.println("Trainee is not added");
        return isAdded;
    }

    @Override
    public void getTraineeDetails() {
        System.out.println("Trainee details are: "+this.trainee);
    }

    @Override
    public boolean updateTraineeDetails() {
        return false;
    }

    @Override
    public boolean deleteTraineeDetails() {
        return false;
    }
}
