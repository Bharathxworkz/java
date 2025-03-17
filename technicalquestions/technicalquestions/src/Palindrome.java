public class Palindrome {
    public static void main(String args[]){
        int num=121;
        int reverse=0;
        int rem;
        int temp;
        temp=num;
        while(temp!=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }
        if (num==reverse){
            System.out.println(reverse + " is a palindrome");
        }
        else {
            System.out.println(reverse + " is not palindrome");
        }
    }
}
