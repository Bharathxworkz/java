import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Try {
    public static void main(String[] args) {
        List  li = new ArrayList();
        li.add("Hi");
        li.add("I am");
        li.add("Bharath");
       Iterator<String> iterator = li.iterator();
       while (iterator.hasNext()){
       String su = iterator.next();
       if( su.startsWith("H"))
           System.out.println(iterator.next());
       }
       li.forEach(System.out::println);
    }
}
