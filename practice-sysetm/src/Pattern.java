public class Pattern {
    static int num = 5;

    public static void main(String[] args) {
        for (int i = 0; i < num; i++) {
            // Print leading spaces
            for (int j = i; j < num ; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
