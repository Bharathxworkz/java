public class PrimeNumber {
    public static void main(String[] args) {
        int n = 1 ;
        checkPrime(n);
    }
    public static void checkPrime(int num){
        int count = 0;
        if(num<2){
            System.out.println(num + " is not prime");
            System.exit(0);
        }

        for (int i=1;i<=num;i++){
            if(num%i==0){
                count = count+1;
            }
        }

        if (count>2){
            System.out.println(num + " is not prime");
        }
        else {
            System.out.println(num + " is prime");
        }
    }
}
