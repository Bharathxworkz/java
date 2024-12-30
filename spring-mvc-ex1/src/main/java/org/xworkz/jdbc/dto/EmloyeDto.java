package org.xworkz.jdbc.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@ToString

public class EmloyeDto implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private long  PhoneNo;
    private int age;
}
