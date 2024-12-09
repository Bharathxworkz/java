package com.xworks.formsystem.servlets.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "formtask_servlet")

public class FormDto {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "sinch", strategy = "increment")
    @GeneratedValue(generator = "sinch")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "country")
    private String country;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
}