package com.xworkz.app.entity;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@ToString
@Data
@Table(name = "medi")
@NamedQuery(name = "checkEmailPassword", query = "select entity from UserEntity entity where entity.email=:email")
@NamedQuery(name = "checkEmail" , query = "select count(entity) from UserEntity entity where entity.email=:email")
@NamedQuery(name = "getAllDistributor", query = "SELECT entity.contactPerson FROM UserEntity entity WHERE entity.businessType=:businessType")
@NamedQuery(name = "getDtoByEmail",query = "select entity from UserEntity entity where entity.email=:email")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String companyName;

    private String contactPerson;

    private String businessType;

    private  long mobile;

    private  String email;

    private  String address1;

    private  String address2;

    private  long pincode;

    private  String referral;

    private  String password;

    private  String confirmPassword;
    private String createdBy;
    private LocalDate createdDate;
    private  String updatedBy;
    private LocalDate updatedDate;

    private String otp;
    private String fileName;
    private String contentType;
}
