public class ReversingString {
        public static void main(String[] args) {
            String str="Raksha Shetty";
            String reversedString = " ";
            char ch;
            int count=0;
            for(int i=0;i<str.length();i++){
                ch=str.charAt(i);

                if(ch!=' '){
                    reversedString=ch+reversedString;
                    count++;
                }
            }
            System.out.println(reversedString);
            System.out.println("Number of character are "+ count);
        }
}
