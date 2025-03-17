import java.util.Scanner;

public class Kollection {
    public static void main(String[] args) {

        String s = "iamgod";
        char c[] = s.toCharArray();
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) == 'a' || s.charAt(i) == 'e') {
                vowel++;
            }

        }
        System.out.println(vowel);
    }
}