package com.xworkz.usernapp.servlet.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "taxUser_details")
public class TaxUserDto {



    @Column(name = "id")

    @Id
    @GenericGenerator(name="ref" , strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
    @Column(name = "pNumber")
    private long pNumber;
    @Column(name = "income")
    private double income;
}
