package com.xworkz.paints;

import com.xworkz.paints.asian.Asian;

public class AsianRunner {

    public static void main(String[] args) {
        Asian asian=new Asian();
        asian.setPaintID(12);
        asian.setColor("Voilet");
        asian.setType("Wall");
        asian.setPrice(4000.00);
        asian.setQuantity("5 L");
        System.out.println(asian);
    }
}
