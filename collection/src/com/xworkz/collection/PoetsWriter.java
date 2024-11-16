package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class PoetsWriter {

    public static void main(String[] args) {

        // List<String> collection = new ArrayList<>();

        Collection<String> collection = new LinkedList<>();
        collection.add("Edgar Allan Poe");
        collection.add("Sylvia Plath");
        collection.add("Maya Angelou");
        collection.add("Emily Dickinson");
        collection.add("Robert Frost");

        Collection<String> collection1 = new ArrayList();
        collection1.add("William Butler Yeats");
        collection1.add("E. E. Cummings");
        collection1.add("Péter Kuczka");
        collection1.add("");
        collection1.add("");

        collection.addAll(collection);


        collection.containsAll(collection);
        collection.addAll(collection1);

        collection.clear();
        collection.remove("KitKat");

        System.out.println(collection.containsAll(collection));
        System.out.println("the collectio size is " + collection.size());

        System.out.println(collection.size());
        // collection.stream().sorted().collect(Collectors.toList());

        boolean isAvailabale = collection.add("mango");
        System.out.println(isAvailabale);


        System.out.println(collection);


        //Retrive a obj from collection
        Iterator<String> itr = collection.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Retrive the collection object
        collection.forEach(System.out::println);
        for (Object st : collection) {
            System.out.println((String) st);

        }
    }

}
