public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s = "prepinsta";
        char[] c = s.toCharArray();
        int vowel=0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                vowel++;
            }
            else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonants);
    }
}
