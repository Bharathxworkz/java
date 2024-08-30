package com.xworkz.lassiapp.lassi;

public class Lassi {
    private int lassiID;
    private   String lassiName;
    private double price;
    private String quantity;
    private String flavour;

    @Override
    public String toString() {
        return "The detals of lassi (the lassi Id:"+this.lassiID+","+
                "the lassiName:"+this.lassiName+","+
                "the price of lassi:"+","+
                "the aintity of lassi:"+","+
                "the flavour of lassi:"+this.flavour+","+
        ")";
    }

    public void setLassiID(int lassiID) {
        this.lassiID = lassiID;
    }

    public int getLassiID() {
        return lassiID;
    }

    public void setLassiName(String lassiName) {
        this.lassiName = lassiName;
    }

    public String getLassiName() {
        return lassiName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

}
