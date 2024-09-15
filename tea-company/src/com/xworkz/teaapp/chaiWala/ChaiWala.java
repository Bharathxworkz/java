package com.xworkz.teaapp.chaiWala;
//polymorphism method
public class ChaiWala {

    private int chaiId;
    private String chaiName;
    private double price;
    private String chaiType;
     private String Quantity;

     @Override
     public int hashCode(){
         return chaiId;
     }

     @Override
      public boolean equals(Object obj){
         //down casting (explicit type casting)
         ChaiWala chaiWala = (ChaiWala)obj;
        // if(this.hashCode() == chaiWala.hashCode())
         if(this.chaiId == chaiWala.chaiId)
             return  true;

             return false;
     }

    @Override
    public String toString() {
        return "ChaiWala-(Chai Id = "+ this.chaiId+","+
                "Chai Name = "+ this.chaiName+","+
                "Chai price ="+this.price+"," +
                "Chai quantity = "+ this.Quantity +" )";
    }

    public void setChaiName(String chaiName) {

         this.chaiName = chaiName;
    }

    public String getChaiName() {

         return chaiName;
    }

    public void setChaiId(int chaiId){
        this.chaiId = chaiId;
    }

    public int getChaiId() {
        return chaiId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setChaiType(String chaiType) {
        this.chaiType = chaiType;
    }

    public String getChaiType() {
        return chaiType;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getQuantity() {
        return Quantity;
    }
}
