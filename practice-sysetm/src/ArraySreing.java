import java.util.Arrays;

public class ArraySreing {
    public static void main(String[] args) {
         int array[] = {1,2,3,4,5};
        Arrays.stream(array).forEach(System.out::println);
        for (int arra:array){
            System.out.println(arra);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();

        }
    }
}
