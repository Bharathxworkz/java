package org.xworkz.jdbc;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto implements Comparable<EmployeeDto>{

    private int id;
    private String name;
    private double salary;
    private String department;

    @Override
    public int compareTo(EmployeeDto o) {
        System.out.println(id +"  "+o.id);
        return this.id -o.id;
    }
}
