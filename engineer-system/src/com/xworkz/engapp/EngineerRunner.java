package com.xworkz.engapp;

import com.xworkz.engapp.cs.Cs;
import com.xworkz.engapp.ec.Ec;
import com.xworkz.engapp.engineer.Engineer;

public class EngineerRunner {
    public static void main(String[] args) {
        Engineer engineer = new Ec();
        engineer.solveProblem();
        Engineer engineer1= new Cs();
        engineer1.solveProblem();
        Engineer engineer2=new Engineer();
        engineer2.solveProblem();
    }
}
