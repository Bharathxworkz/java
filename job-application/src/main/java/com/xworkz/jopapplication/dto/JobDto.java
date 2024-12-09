package com.xworkz.jopapplication.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "job")

public class JobDto {

    @Id
    @GenericGenerator(name = "id",strategy = "increment")
    @GeneratedValue(generator = "id")
    @Column(name = "userid")
    private int userid;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phoneNo;
    @Column(name = "position")
    private String position;
    @Column(name = "experience")
    private String experience;

}
