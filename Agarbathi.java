class Agarbathi{
	
	String brandName;
	int noOfSticks;
	String fragnance;
	double price;

public boolean createBathi( String brandName, int noOfSticks, String fragnance, double price){

  boolean isBathiCreated=false;
  if(brandName!=null && noOfSticks>0 && fragnance!=null && price>0){
  
  this.brandName=brandName;
  this.noOfSticks=noOfSticks;
  this.fragnance=fragnance;
  this.price=price;
  isBathiCreated=true;
  }
  
  return isBathiCreated;
  }
   
   public void displayBathiInfo(){
   
  System.out.println("The Brand name :"+ this.brandName);
  System.out.println("The no of sticks"+this.noOfSticks);
  System.out.println("The Fragrance is"+this.fragnance);
  System.out.println("The Price is"+this.price);
  }
 
}