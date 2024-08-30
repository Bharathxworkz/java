package com.xworkz.testapp;

import com.xworkz.testapp.encapulation.Encapulation;

public class EncapulationRunner {

    public static void main(String[] args) {
        Encapulation encapulation = new Encapulation();
        encapulation.setName("Bharath L");
        encapulation.setId(17);
        encapulation.setSalary(140000.00);
        encapulation.setDomain("Software Engineer");

        System.out.println("The employe name:"+encapulation.getName());
        System.out.println("The employe id:"+encapulation.getId());
        System.out.println("The employe current salary:"+encapulation.getSalary());
        System.out.println("The employe current working domain:"+encapulation.getDomain());
    }
}
