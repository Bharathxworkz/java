import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        // Populating the array with user inputs
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Find the maximum and minimum values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
