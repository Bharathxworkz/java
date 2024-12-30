package com.xworkz.userapp.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_form_details")
@NamedQueries({
        @NamedQuery(name = "getAllUsers", query="from UserDto userDto"),
        @NamedQuery(name="deleteUserById",query = "delete from UserDto user where user.id=:idd"),
        @NamedQuery(name = "getUserById" , query = "select user from UserDto user where user.id=:idd")


})
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_firstName")
    private  String firstName;
    @Column(name = "user_lastName")
    private String lastName;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_city")
    private String city;
    @Column(name = "user_phoneNumber")
    private  long phoneNumber;
    @Column(name = "user_adhaar")
    private  long adhaar;
    @Column(name = "user_age")
    private  int age;
}
