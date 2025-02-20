import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
      //  int num=6;
        System.out.println(num +" factorial:"+factorial(num));
    }
}
