package com.xworkz.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class UserDto implements Serializable {
    private String fiirstName;
    private String lastName;
    private String email;
    private Long phNo;
    private String password;
}
