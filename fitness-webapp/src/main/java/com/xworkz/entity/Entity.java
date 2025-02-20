package com.xworkz.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Table;

@ToString
@Data
@javax.persistence.Entity
@Table(name = "navu")
@Component
public class Entity {
    private String fiirstName;
    private String lastName;
    private String email;
    private Long phNo;
    private String password;
}
