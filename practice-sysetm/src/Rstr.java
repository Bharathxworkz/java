public class Rstr {

    public static void main(String[] args) {
        String str="i am full stack devloper";
        String rstr = "";
        char ch ;
     for (int i = 0; i <str.length() ; i++) {
                ch = str.charAt(i);
         rstr = ch + rstr;

                /*if (ch !=' ') {
                    rstr = ch + rstr;

                }*/
        }
        System.out.println(rstr);

    }
}
