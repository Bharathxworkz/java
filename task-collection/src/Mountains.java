import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mountains {
    public static void main(String[] args) {
        List<String> mountains = new ArrayList<>();
        mountains.add("Mount Everest");
        mountains.add("K2");
        mountains.add("Kangchenjunga");
        mountains.add("Lhotse");
        mountains.add("Makalu");

        List<String> moreMountains = new ArrayList<>();
        moreMountains.add("Cho Oyu");
        moreMountains.add("Dhaulagiri");
        moreMountains.add("Manaslu");
        moreMountains.add("Nanga Parbat");

        System.out.println(moreMountains.addAll(mountains));
        System.out.println(moreMountains.addAll(2, mountains));
        System.out.println(moreMountains.size());
        System.out.println(moreMountains.remove("Lhotse"));

        List<String> toRemove = new ArrayList<>();
        toRemove.add("K2");
        toRemove.add("Makalu");
        System.out.println(moreMountains.removeAll(toRemove));

        moreMountains.clear();
        System.out.println(moreMountains.isEmpty());

        System.out.println(moreMountains.addAll(mountains));
        System.out.println(moreMountains.contains("Kangchenjunga"));
        System.out.println(moreMountains.containsAll(mountains));
        System.out.println(moreMountains.retainAll(mountains));

        System.out.println(moreMountains.get(0));
        moreMountains.add(0, "Gasherbrum");
        System.out.println(moreMountains.addAll(1, mountains));

        System.out.println(moreMountains.size());

        Iterator<String> itr = moreMountains.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
