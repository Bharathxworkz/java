package com.xworkz.userapp.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servlet_formsix")
public class UserDto {
    @Column(name = "user_id")
    @Id
    private int userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String Gender;
    @Column(name = "adhar_number")
    private long adharNumber;
    @Column(name = "address")
    private String address;

}
