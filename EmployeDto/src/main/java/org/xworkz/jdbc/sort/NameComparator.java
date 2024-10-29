package org.xworkz.jdbc.sort;

import org.xworkz.jdbc.EmployeeDto;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeDto> {
    @Override
    public int compare(EmployeeDto o1, EmployeeDto o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
