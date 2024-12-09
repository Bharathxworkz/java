public class Exceptions {
    public static void main(String[] args) {
        try {
            int a[]={};
            for (int i = 0; i <a.length ; i++) {
                a[i] = i + 1;

                System.out.println(a[i]);
            }
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
