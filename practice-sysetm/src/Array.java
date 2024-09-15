import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();  // Reading the size of the array

        int[] num = new int[size];  // Initializing the array with the given size

        // Populating a4nd printing the array elements
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            if (num[i] % 2 == 0) {
                System.out.println("The number is even: " + num[i]);
            } else {
                System.out.println("The number is odd: " + num[i]);
            }
        }
    }
}
