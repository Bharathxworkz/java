import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PoetsWriters {
    public static void main(String[] args) {
        List<String> poetsWriters = new ArrayList<>();
        poetsWriters.add("Shakespeare");
        poetsWriters.add("Wordsworth");
        poetsWriters.add("Poe");
        poetsWriters.add("Hemingway");
        poetsWriters.add("Frost");

        List<String> moreWriters = new ArrayList<>();
        moreWriters.add("Orwell");
        moreWriters.add("Twain");
        moreWriters.add("Huxley");
        moreWriters.add("Dickens");

        System.out.println(moreWriters.addAll(poetsWriters));
        System.out.println(moreWriters.addAll(2, poetsWriters));
        System.out.println(moreWriters.size());
        System.out.println(moreWriters.remove("Dickens"));

        List<String> toRemove = new ArrayList<>();
        toRemove.add("Shakespeare");
        toRemove.add("Wordsworth");
        System.out.println(moreWriters.removeAll(toRemove));

        moreWriters.clear();
        System.out.println(moreWriters.isEmpty());

        System.out.println(moreWriters.addAll(poetsWriters));
        System.out.println(moreWriters.contains("Frost"));
        System.out.println(moreWriters.containsAll(poetsWriters));
        System.out.println(moreWriters.retainAll(poetsWriters));

        System.out.println(moreWriters.get(0));
        moreWriters.add(0, "Austen");
        System.out.println(moreWriters.addAll(1,poetsWriters));

        System.out.println(moreWriters.size());

        Iterator<String> itr = moreWriters.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
