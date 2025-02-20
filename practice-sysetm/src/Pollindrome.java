public class Pollindrome {
    public static void main(String[] args) {
        int num=122;
        int rem;
        int rev=0;
        int temp;
        temp=num;
        while (temp !=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;

        }
        if (num==rev){
            System.out.println("number is pollindrome :"+num);
        }else{
            System.out.println("givem number not pollindrome :"+num);
        }
    }
}
