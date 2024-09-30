package com.xworkz.passportapp.passport.impl;

import com.xworkz.passportapp.exception.AgeNotFoundException;
import com.xworkz.passportapp.exception.EmailNotFoundException;
import com.xworkz.passportapp.exception.NameNotFoundException;
import com.xworkz.passportapp.exception.UserIdNotFoundException;
import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.user.User;

public class PassportImpl implements Passport {

    User user[] = new User[1];
    int index;

    boolean isAdded = false;
    @Override
    public boolean user(User user) {
        if(user != null){
            if(user.getName() != null){
                this.user[index++] = user;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getAllUserDetails() {
        for (User user : user)
        System.out.println("User details : "+user);
    }

    /* @Override
     public boolean updateUserDetails(String newhintAns) {
         boolean isUpdated = false;
         if(newhintAns != null){
             this.user.setHintAns(newhintAns);
             isUpdated = true;
         }else System.out.println("Invalid answer");
         return isUpdated;
     }*/
    @Override
    public boolean deleteUserDetails() {
        boolean isDeleted = false;
        if(this.user == null){
            this.user = user;
            isDeleted = true;
        }
        else System.out.println("Cannot be deleted");

        return isDeleted;
    }
//update phone number by id;
    @Override
    public boolean updatePhoneNoById(long phoneNewNo, int existingid)
    {
        boolean isUpdated = false;
        for (int index = 0; index < user.length; index++) {
            try {
                System.out.println("1st exception started");
                if (this.user[index].getId() == existingid) {
                    this.user[index].setPhoneNo(phoneNewNo);
                    isUpdated = true;
                } /*else
                    System.out.println("Id cannot find");*/
                if (!isUpdated) {
                    UserIdNotFoundException userIdNotFoundException = new UserIdNotFoundException("Provided Id is not found");
                    throw userIdNotFoundException;
                }
            }catch (UserIdNotFoundException us){
                us.printStackTrace();
            }
            System.out.println("1st exception ended");
            }
        return isUpdated;
    }

    @Override
    public boolean updateAddressById(String newAddress, int existingid) {
        boolean isUpdated = true;
        for (int index = 0; index < 1; index++) {
            try {
                System.out.println("2nd exception started");
                if (user[index].getId() == existingid) {
                    this.user[index].setAddress(newAddress);
                    isUpdated = true;
                }/*else
                System.out.println("Id cannot found");*/
                if(!isUpdated){
                    UserIdNotFoundException userIdNotFoundException = new UserIdNotFoundException("Id is not available");
                            throw userIdNotFoundException;
                }
            }catch(UserIdNotFoundException use){
                use.printStackTrace();
            }
            System.out.println("2nd exception ended");
        }
        return isUpdated;
    }

    @Override
    public String getGenderByName(String name) {
        String gender = null;
        for (int index = 0; index < user.length; index++) {
            try {
                System.out.println("3rd exception started");
                if (this.user[index].getName().equals(name)) {
                    gender = this.user[index++].getGender();
                }/*else
                System.out.println("Name cannot found");*/
                if(gender == null){
                    NameNotFoundException nameNotFoundException = new NameNotFoundException("Provided name is not found");
                    throw nameNotFoundException;
                }
            }catch(NameNotFoundException nm){
                nm.printStackTrace();
            }
            System.out.println("3rd exception ended");
        }
        return gender;
    }

    @Override
    public int getAgeByName(String name) {
        int age = 0;
        for (int index = 0; index < user.length; index++) {
            try {
                System.out.println("4th exception started");
                if (this.user[index].getName().equals(name)) {
                    age = this.user[index].getAge();
                } /*else
                    System.out.println("Name cannot found");*/
                if(age == 0){
                    AgeNotFoundException ageNotFoundException = new AgeNotFoundException("Age is not found");
                    throw ageNotFoundException;
                }
            }catch(AgeNotFoundException ag){
                ag.printStackTrace();
            }
            System.out.println("4th exception started");
        }
        return age;
    }

    @Override
    public String getNameById(int id) {
        String name = null;
        for (int index = 0; index < user.length; index++) {
            try {
                System.out.println("5th exception started");
                if (this.user[index].getId() == id) {
                    name = this.user[index].getName();
                } /*else
                    System.out.println("Cannot found Id");*/
                if(id == 0){
                    UserIdNotFoundException userIdNotFoundException = new UserIdNotFoundException("Id is not available");
                    throw userIdNotFoundException;
                }
            }catch(UserIdNotFoundException u){
                u.printStackTrace();
            }
            System.out.println("5th exception ended");
        }
        return name;
    }
    public boolean password(String password, String cpassword){
        boolean isPasswordCorrect = false;
        if(password.equals(cpassword)) {
            System.out.println("password matches correctly");
        }else System.out.println("password does not matches");
        return isPasswordCorrect;
    }

    @Override
    public String getPasswordByEmail(String eMail) {
        String password = null;
        for (int index = 0; index < index; index++) {
            try {
                if (user[index].getEmail().equals(eMail)) {
                    password = user[index].getPassWord();
                }
                if(password == null){
                    EmailNotFoundException emailNotFoundException = new EmailNotFoundException("Email is not available");
                            throw emailNotFoundException;
                }
            }catch (EmailNotFoundException em){
                em.printStackTrace();
            }
        }
        return password;
    }
}
