package com.xworkz.overideapp.classb;


import com.xworkz.overideapp.classa.ClassA;

public class ClassB extends ClassA {
   @Override
    public void addition() {
        super.addition();
    }
    public void multiple ()
    {
        System.out.println(2*5);
    }
}
