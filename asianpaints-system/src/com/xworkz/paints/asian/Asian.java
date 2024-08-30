package com.xworkz.paints.asian;

public class Asian {
    private int paintID;
    private String color;
    private String type;
    private  double price;
    private String quantity;

    @Override
    public String toString() {
        return "Asianpaint details-(paintID:"+this.paintID+ ", "+
                "paint color:"+this.color+","+
                "paint type for :"+this.type+","+
                "the price of paint:"+this.price+"'"+
                "The quantity of price:"+this.quantity+
                ")";
    }

    public void setPaintID(int paintID) {
        this.paintID = paintID;
    }

    public int getPaintID() {
        return paintID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
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
}
