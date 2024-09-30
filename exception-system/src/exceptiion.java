public class exceptiion {


    public static void main(String[] args) {
        System.out.println("main method startd");

        divide(7,0);
        System.out.println("main method ended");

    }
    public static void divide(int r,int p)
    {

        System.out.println("divide method startd");
        try {
            System.out.println(r/p);
        }catch (ArithmeticException e)
        {
            System.out.println("we can not divide any number with zero");
        }
        System.out.println("divide method ended");
    }

}
