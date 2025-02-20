import java.util.Scanner;

public class Hlo {
    public static void main(String[] nanu) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

