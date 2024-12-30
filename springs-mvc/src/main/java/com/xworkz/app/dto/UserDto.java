package com.xworkz.app.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "UserRegistration")
@NamedQuery(name = "getAllData" ,query ="from UserDto dto")
@NamedQuery(name = "getUserById" , query = "select user from UserDto user where user.id=:idd")
public class UserDto implements Serializable {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name="PhoneNo")
    private long  PhoneNo;
    @Column(name = "age")
    private int age;
}
