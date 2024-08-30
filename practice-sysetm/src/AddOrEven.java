public class AddOrEven {
    public static void main(String[] args) {
        int num=100;
        for (int i = 0; i <=num ; i++) {
            if (i%2==0)
            {
                System.out.println("The given number is even:"+i);
            }
            else {
                System.out.println("The given number is odd:"+i);
            }
        }
    }
}
