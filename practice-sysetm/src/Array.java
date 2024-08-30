public class Array{
    public static void main(String[] args) {
        int[] num = new int[100] ;  // Directly initializing the array with values

        // Printing the array elements
        for (int i = 0; i < num.length; i++) {
         num[i]=i+1;
         if (num[i]%2==0) {

             System.out.println("yhe number is even: " + num[i]);
         }else {
             System.out.println("The number is odd:"+num[i]);
         }
        }
    }
}
