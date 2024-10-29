import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clothes {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("Nike");
        array.add("Puma");
        array.add("Zara");
        array.add("TechnoSports");
        array.add("Adidas");

        List<String> array1 = new ArrayList<>();
        array1.add("Flying Machine");
        array1.add("Zudio");
        array1.add("Reliance");
        array1.add("Ramraj");
        array1.add("H&M");
        array1.add("Levis");

        System.out.println(array1.addAll(array));
        System.out.println(array1.addAll(2, array));
        System.out.println(array1.size());
        System.out.println(array1.remove("Ramraj"));

        List<String> toRemove = new ArrayList<>();
        toRemove.add("Nike");
        toRemove.add("Zudio");
        System.out.println(array1.removeAll(toRemove));

        array1.clear();
        System.out.println(array1.isEmpty());

        System.out.println(array1.addAll(array));
        System.out.println(array1.contains("Puma"));
        System.out.println(array1.containsAll(array));
        System.out.println(array1.retainAll(array));

        System.out.println(array1.get(2));
        array1.add(2, "Levis");
        System.out.println(array1.addAll(3, array));

        System.out.println(array1.size());

        Iterator<String> itr = array1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
