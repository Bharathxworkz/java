import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatch extends Object
{

    public static void main(String[] args) {




        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = scanner.nextInt();
            System.out.println(age);
        }
        catch (InputMismatchException a){
            a.printStackTrace();

            System.out.println("provide numbers only");
        }
    }
}






























































































































































































































































































































































































