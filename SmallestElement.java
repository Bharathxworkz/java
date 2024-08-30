public class SmallestElement {  
    public static void main(String[] args) {      
          
     
        int [] arr = {0, 11, 0, 75, 0};   
          
          
        int min = arr[0];  
          
       
        for (int i = 0; i < arr.length; i++) {   
             
           if(arr[i] < min)  
               min = arr[i];  
        }    
        System.out.println("Smallest element present in given array: " + min);  
    }  
}  