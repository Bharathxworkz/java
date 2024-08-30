public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) {
            int count = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            // If count is still 0, the number is prime
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
