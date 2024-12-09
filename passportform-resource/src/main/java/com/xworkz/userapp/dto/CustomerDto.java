package com.xworkz.userapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "servlet_formseven")
public class CustomerDto {
    @Column(name = "customer_id")
    @Id
    @GenericGenerator(name = "ref" , strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    @Column(name = "register_to_apply_at")
    private String registerToApplyAt;
    @Column(name = "passport_office")
    private String passportOffice;
    @Column(name = "given_name")
    private String givenName;
    @Column(name = "sur_name")
    private String surName;
    @Column(name = "dob")
    private String dob;
    @Column(name = "email")
    private String email;
    @Column(name = "is_email_id_same")
    private String  isEmailIdSame;
    @Column(name = "login_id")
    private String loginId;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;
    @Column(name = "hint_question")
    private String hintQuestion;
    @Column(name = "hint_answer")
    private String hintAnswer;
    @Column(name = "captcha")
    private String captcha;

}
