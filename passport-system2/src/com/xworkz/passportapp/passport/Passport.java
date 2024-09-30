package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.user.User;

public interface Passport {

    boolean user(User user);
    void getAllUserDetails();
    //boolean updateUserDetails();
    boolean deleteUserDetails();

    boolean updatePhoneNoById(long phoneNewNo, int existingid);
    boolean updateAddressById(String newAddress, int existingid);
    String getGenderByName(String name);
    int getAgeByName(String name);
    String getNameById(int id);
    boolean password(String password, String cpassword);
    String getPasswordByEmail(String eMail);
    }
