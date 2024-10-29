import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList();
        collection.add(20);
        collection.add(40);
        collection.add(82);
        collection.add(90);
       Iterator <Integer> itr1 = collection.iterator();
       while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        Collection<String> collection1 = new ArrayList();
        collection1.add("Bharath L");
        collection1.add("vinuth");
        collection1.add("prajawal");
        collection1.add("24");


        Iterator<String> itr = collection1.iterator();
        while (itr.hasNext()){
       String col= itr.next();
            if (col.startsWith("v"))
            System.out.println(itr.next());
        }
        for (String sui:collection1){
            String col= itr.next();
            if (col.startsWith("v"))
            System.out.println(sui);
        }

    }
}