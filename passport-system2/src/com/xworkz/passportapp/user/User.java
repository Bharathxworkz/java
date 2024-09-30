package com.xworkz.passportapp.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString


public class User {

    private int id;
    private String name;
    private String gender;
    private int age;
    private String address;
    private long phoneNo;
    private String email;
    private String passWord;
    private String confirmPassword;
}
