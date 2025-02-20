package com.xworkz.app.dto;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spring_mvc")
@NamedQuery(name = "getAllUsers" , query = "from UserDto dto")
@NamedQuery(name = "deleteUserById" , query = "delete from UserDto user where user.id=:idd")
@NamedQuery(name = "getUserById" , query = "select user from UserDto user where user.id=:idd")
public class UserDto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
}
//1)Dispatcher servlet
//2)handlermapping
//3)controller
//4)Viewresolver