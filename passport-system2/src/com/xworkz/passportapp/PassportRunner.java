package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passport.impl.PassportImpl;
import com.xworkz.passportapp.user.User;

import java.util.Scanner;

public class PassportRunner {

    public static void main(String[] args) {
        Passport passport = new PassportImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 1; index++) {
            User user = new User();

            System.out.println("Enter a Id");
            int id = scanner.nextInt();
            user.setId(id);

            System.out.println("Enter a name");
            String name = scanner.next();
            user.setName(name);

            System.out.println("Enter a gender");
            String gender = scanner.next();
            user.setGender(gender);

            System.out.println("Enter a age");
            int age = scanner.nextInt();
            user.setAge(age);

            System.out.println("Enter a address");
            String address = scanner.next();
            user.setAddress(address);

            System.out.println("Enter phone number");
            long phoneNo = scanner.nextLong();
            user.setPhoneNo(phoneNo);

            System.out.println("Enter the email of the user");
            String email = scanner.next();
            user.setEmail(email);

            System.out.println("Enter the password");
            String password = scanner.next();
            user.setPassWord(password);

            System.out.println("Enter the confirm password");
            String cpassword = scanner.next();
            user.setConfirmPassword(cpassword);
            passport.password(password,cpassword);
            passport.user(user);
        }
        passport.getAllUserDetails();

        //updatePhoneNoById;
        User user = new User();
        System.out.println("Enter a Id Which you want to change number");
        int id = scanner.nextInt();

        System.out.println("Enter a new phone number");
        long newNo = scanner.nextLong();
        user.setPhoneNo(newNo);

        passport.updatePhoneNoById(newNo,id);
        passport.getAllUserDetails();


        //update updateAddressById;
        System.out.println("Enter a id you want to change address");
        id = scanner.nextInt();

        System.out.println("Enter a new address");
        String address = scanner.next();
        user.setAddress(address);

        passport.updateAddressById(address,id);
        passport.getAllUserDetails();

        //getGenderByName
        System.out.println("Enter a name to get gender");
        String name = scanner.next();

        String gender = passport.getGenderByName(name);
        System.out.println("The gender is : "+ gender);

        //passport.getAllUserDetails();

        //get age by name;
        System.out.println("Enter a name which you want to get the age");
        name = scanner.next();

        int age = passport.getAgeByName(name);
        System.out.println("The age of the given name is: "+ age);

        //get Name By Id;
        System.out.println("Enter a Id to get a name");
        id = scanner.nextInt();
        name = passport.getNameById(id);
        System.out.println("The Name of the given Id is: "+name);
    }
}
