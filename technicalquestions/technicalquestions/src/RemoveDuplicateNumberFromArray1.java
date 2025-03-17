import java.util.Arrays;

public class RemoveDuplicateNumberFromArray1 {
    public static void main(String args[]) {
        int num[] = {1, 3, 4, 3, 8, 5, 3}; // Original array
        Arrays.sort(num); // Step 1: Sort the array

        int uniqueCount = 0; // Step 2: Track unique elements
        for (int i = 1; i < num.length; i++) { // Step 3: Loop from the second element
            if (num[i] != num[uniqueCount]) { // Step 4: If different from last unique value
                uniqueCount++; // Move index forward
                num[uniqueCount] = num[i]; // Store the unique value in its new position
            }
        }

        // Step 5: Print only unique values
        for (int i = 0; i <= uniqueCount; i++) {
            System.out.print(num[i] + " ");
        }



    }
}
