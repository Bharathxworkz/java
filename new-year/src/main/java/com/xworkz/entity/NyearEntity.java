package com.xworkz.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@ToString
@Data
@Entity
@Table(name = "nav")
@Component
public class NyearEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int id;
    private String firstName;
    private  String lastName;
    private  String email;
    private String alternateEmail;
    private  Long contact;
    private  Long alternateContact;
    private String dateOdBirth;
    private  String place;
    private  String state;
    private  String district;
    private  String password;
    private  String confirmPassword;
    private String createdBy;
    private LocalDate createdTime;
    private String updatedBy;
    private LocalDate updatedTime;
    private String fileName;
    private String contentType;
    private int attemptlogin;

}
