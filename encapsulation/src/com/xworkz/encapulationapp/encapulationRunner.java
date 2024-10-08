package com.xworkz.encapulationapp;

public class encapulationRunner {

    public static void main(String[] args) {

        Data data = new Data();
        data.setId(1);
        data.setName("Bhartah L");
        data.setProfesinal("IT");
        data.setSalary(12001);
        System.out.println("The empolye name is :"+data.getName());
        System.out.println("The employe id is :" +data.getId());
        System.out.println("The employe profesional is: "+data.getProfesinal());
        System.out.println("Current employe salart :" + data.getSalary());

    }
}
