public class Fiboniacl {
    public static int fibonical(int n){
        if(n<=1){
            return n;
        }
        return fibonical(n-1)+fibonical(n-2);


    }
    public  static void fibseries(int n){
        for (int i=0; i<n; i++){
            System.out.print(fibonical(i)+" ");
        }
    }

    public static void main(String[] args) {
        int n=8;
      fibseries(n);
      //  System.out.println();

    }
}
