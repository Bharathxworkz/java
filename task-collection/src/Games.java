import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Games {
    public static void main(String[] args) {
        List<String> gameNames = new ArrayList<>();
        gameNames.add("Chess");
        gameNames.add("Cricket");
        gameNames.add("Football");
        gameNames.add("Basketball");
        gameNames.add("Tennis");

        List<String> moreGames = new ArrayList<>();
        moreGames.add("Badminton");
        moreGames.add("Hockey");
        moreGames.add("Volleyball");
        moreGames.add("Table Tennis");

        System.out.println(moreGames.addAll(gameNames));
        System.out.println(moreGames.addAll(2, gameNames));
        System.out.println(moreGames.size());
        System.out.println(moreGames.remove("Hockey"));

        List<String> toRemove = new ArrayList<>();
        toRemove.add("Cricket");
        toRemove.add("Football");
        System.out.println(moreGames.removeAll(toRemove));

        moreGames.clear();
        System.out.println(moreGames.isEmpty());

        System.out.println(moreGames.addAll(gameNames));
        System.out.println(moreGames.contains("Tennis"));
        System.out.println(moreGames.containsAll(gameNames));
        System.out.println(moreGames.retainAll(gameNames));

        System.out.println(moreGames.get(2));
        moreGames.add(2, "Rugby");
        System.out.println(moreGames.addAll(3, gameNames));

        System.out.println(moreGames.size());

        Iterator<String> itr = moreGames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
