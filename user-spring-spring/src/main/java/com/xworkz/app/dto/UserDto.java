package com.xworkz.app.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_details_spring")
public class UserDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "email")
    private String email;
}
