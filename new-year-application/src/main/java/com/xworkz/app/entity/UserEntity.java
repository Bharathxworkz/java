package com.xworkz.app.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@ToString
@Data
@Table(name = "user_details_for_new_year")
@NamedQuery(name = "checkEmail", query = "select count(entity) from UserEntity entity where entity.email=:email")
@NamedQuery(name = "checkEmailPassword", query = "select entity from UserEntity entity where entity.email=:email")
@NamedQuery(name = "getDtoByEmail",query = "select entity from UserEntity entity where entity.email=:email")
@NamedQuery(name = "checkPhoneNumber",query = "select count(entity) from UserEntity entity where entity.contactNumber=:contactNumber")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;
    @Column(name = "email")
    private String email;
    @Column(name = "alter_email")
    private String alterEmail;
    @Column(name = "contact_number")
    private Long contactNumber;
    @Column(name = "alter_contact_number")
    private Long alterContactNumber;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "place")
    private String place;
    @Column(name = "state")
    private String state;
    @Column(name = "district")
    private String district;
    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;
    @Column(name = "created_by")
    private String cratedBy;
    @Column(name = "created_time")
    private LocalDate createdTime;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_time")
    private LocalDate updatedTime;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "content_type")
    private String contentType;
    @Column(name = "attempt_login_flag")
    private int attempt;
    @Column(name = "otp")
    private String otp;
}
