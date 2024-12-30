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
@Table(name = "user1_details")


public class UserDto {


    @Id
    @GenericGenerator(name="ref" , strategy = "increment")
    @GeneratedValue(generator = "ref")

    @Column
    private  int id;
    @Column(name = "firstName")
    private  String firstName;
    @Column(name = " lastName")
    private  String lastName;
    @Column(name = "age")
    private  int age;
    @Column(name = "phoneNumber")
    private long phoneNumber;
    @Column(name = "adhaar")
    private  String adhaar;
}
