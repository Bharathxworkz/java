package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passport.impl.PassportImpl;
import com.xworkz.passportapp.user.User;

public class PassportRunner {

    public static void main(String[] args) {
        User user = new User();
        user.setName("pinku");
        user.setSurName("Peter");
        user.setPassportOffice("Ahembad");
        user.setDob("01/05/2001");
        user.setHintQues("your fav color");
        user.setHintAns("pink");
        Passport passport = new PassportImpl();
        passport.addUser(user);
        passport.getUserDetails();



    }
}
