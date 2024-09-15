package com.xworkz.passportapp.passport.impl;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.user.User;

public class PassportImpl implements Passport {
    User user [] = new User[1];
     int index;
    boolean isAdded = false;
    @Override
    public boolean addUser(User user) {
        if(user != null){
            if(user.getName() != null && user.getSurName() != null &&
                    user.getPassportOffice() != null) {

                this.user[index] = user;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getUserDetails() {
        System.out.println("User details : "+this.user);
    }

    @Override
    public boolean updateUserDetails() {

        return false;
    }

    @Override
    public boolean deleteUserDetails() {

        return false;
    }
}
