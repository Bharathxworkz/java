package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MountainName {

    public static void main(String[] args) {

        // List<String> collection = new ArrayList<>();

        Collection<String> collection = new ArrayList<>();
        collection.add("");
        collection.add("");
        collection.add("");
        collection.add("");
        collection.add("");

        Collection<String> collection1 = new ArrayList();
        collection1.add("");
        collection1.add("");
        collection1.add("");
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
