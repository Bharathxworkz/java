package com.xworkz.lassiapp;

import com.xworkz.lassiapp.lassi.Lassi;

public class LassiRunner {
    public static void main(String[] args) {
        Lassi lassi=new Lassi();
        lassi.setLassiID(15);
        lassi.setLassiName("lassi");
        lassi.setPrice(60.00);
        lassi.setQuantity("100ML");
        lassi.setFlavour("Straberry");
        System.out.println(lassi);
    }
}
