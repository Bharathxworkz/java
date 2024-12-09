package com.xworkz.userapp.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "serv")
public class UserDto {

    @Id
    @GenericGenerator(name = "id", strategy = "increment")
    @GeneratedValue(generator = "id")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "adhar_number")
    private Long adharNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "current_job_title")
    private String currentJobTitle;

    @Column(name = "years_of_experience")
    private int yearsOfExperience;
}
