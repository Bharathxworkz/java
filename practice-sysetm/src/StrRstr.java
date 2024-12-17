public class StrRstr {
    public static void main(String[] args) {
        String str = "I am Bharatth";
        String rstr = "";
        int count = 0;
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch != ' ') {
                rstr = ch + rstr;
                count++;
            }
        }

        System.out.println("Reversed String without spaces: " + rstr);
        System.out.println("Count of characters (excluding spaces): " + count);
    }
}
