package org.xworkz.com;

import java.util.ArrayList;
import java.util.List;

public class Employe {
    public static void main(String[] args) {
        List emp = new ArrayList();
        Empoyes empoyess = new Empoyes("Bharath L", 25000, 2020);
        Empoyes empoyess1 = new Empoyes("Suhas", 200000, 2020);
        Empoyes empoyess2 = new Empoyes("Abhilash", 206055, 2020);
        emp.add(empoyess);
        emp.add(empoyess);
        emp.add(empoyess);

        System.out.println("the highest salary of employe");
        emp.sort(new Empoyes());
        emp.forEach(System.out::println);

    }
}
