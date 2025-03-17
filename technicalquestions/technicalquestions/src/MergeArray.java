import java.util.Arrays;

public class MergeArray {

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};

            int[] merged = new int[arr1.length + arr2.length];

            // Copy elements from both arrays
            int index = 0;
            for (int num : arr1) {
                merged[index++] = num;
            }
            for (int num : arr2) {
                merged[index++] = num;
            }

            // Print merged array
            System.out.println("Merged Array: " + Arrays.toString(merged));
        }


}
