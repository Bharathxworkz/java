public class ReversingNumber {
    public static void main(String args[]){
        int num=1234;
        int reverse=0;
        int rem;

        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
//        for (;num!=0;num=num/10){
//            rem=num%10;
//            reverse=reverse*10+rem;
//        }
        System.out.println(reverse);
    }
}
