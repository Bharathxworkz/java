package org.xworkz.jdbc.dto;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Stuent")

public class StudentDto  {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private  int age;
    @Column (name = "Gender")
    private  String gender;
    @Column (name = "grade")
    private char grade;
}
