package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.user.User;

public interface Passport {

    boolean addUser(User user);
    void getUserDetails();
    boolean updateUserDetails();
    boolean deleteUserDetails();
}
