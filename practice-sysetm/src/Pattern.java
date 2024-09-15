import java.util.Scanner;

public class Pattern {

  ;

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
         int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            // Print leading spaces
            for (int j = 1; j < num ; j++) {
                System.out.print(" *");
            }
            // Print stars

            // Move to the next line
            System.out.println();
        }
    }
}
