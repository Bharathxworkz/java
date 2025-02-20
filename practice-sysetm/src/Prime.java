public class Prime {
    public static void main(String[] args) {
        int  n=3;
         checkprime(n);
    }
    public static int checkprime(int num){
        int count=0;
        if(num<2){
            System.out.println("not prime");
            System.exit(0);
        }
        for (int i = 1; i <=num ; i++) {
            if(num % i==0){
                count=count+1;
            }

        }
        if (count>2){
            System.out.println(num +" not prime");
        }
        else {
            System.out.println("is prime"+num);
        }
        return count;
    }
}
