import javafx.util.converter.LocalDateStringConverter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList();
        collection.add(1);
        collection.add(5);
        collection.add(6);
        collection.add(5);

        for (Integer integer : collection){
            if (integer%2 ==0)
                System.out.println(integer);
        }
      List<Integer> EvenNumbers= collection.stream().filter(i->(i%2==0)).collect(Collectors.toList());
        EvenNumbers.forEach(System.out::println);
        System.out.println(collection);
    }
}
