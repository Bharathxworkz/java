import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Diseases {
    public static void main(String[] args) {
        List<String> diseases = new ArrayList<>();
        diseases.add("Flu");
        diseases.add("Diabetes");
        diseases.add("Cancer");
        diseases.add("Covid-19");
        diseases.add("HIV/AIDS");

        List<String> moreDiseases = new ArrayList<>();
        moreDiseases.add("Tuberculosis");
        moreDiseases.add("Malaria");
        moreDiseases.add("Hepatitis");
        moreDiseases.add("Cholera");

        System.out.println(moreDiseases.addAll(diseases));
        System.out.println(moreDiseases.addAll(2, diseases));
        System.out.println(moreDiseases.size());
        System.out.println(moreDiseases.remove("Cancer"));

        List<String> toRemove = new ArrayList<>();
        toRemove.add("Flu");
        toRemove.add("Hepatitis");
        System.out.println(moreDiseases.removeAll(toRemove));

        moreDiseases.clear();
        System.out.println(moreDiseases.isEmpty());

        System.out.println(moreDiseases.addAll(diseases));
        System.out.println(moreDiseases.contains("Diabetes"));
        System.out.println(moreDiseases.containsAll(diseases));
        System.out.println(moreDiseases.retainAll(diseases));

        System.out.println(moreDiseases.get(0));
        moreDiseases.add(0, "Ebola");
        System.out.println(moreDiseases.addAll(1, diseases));

        System.out.println(moreDiseases.size());

        Iterator<String> itr = moreDiseases.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
