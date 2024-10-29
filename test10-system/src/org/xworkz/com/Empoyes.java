package org.xworkz.com;

import lombok.*;

import java.util.Comparator;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Empoyes implements Comparator<Empoyes> {
    private String Name;
    private int salary;
    private  int year;


    @Override
    public int compare(Empoyes o1, Empoyes o2) {
        return o2.getSalary() -o1.getSalary();
    }
}
