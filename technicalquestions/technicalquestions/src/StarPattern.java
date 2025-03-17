public class StarPattern {

        public static void main(String[] args) {
            //1. Right angled

//            int n = 5; // Number of rows
//
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }


            //2. Inverted Triangle Pattern

//            int n = 5;
//
//            for (int i = n; i >= 1; i--) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }


            //3. Pyramid Pattern

//            int n = 5;
//
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= n - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 1; k <= (2 * i - 1); k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }


            //4. Diamond Pattern

            int n = 5;

            // Upper part
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Lower part
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
}
