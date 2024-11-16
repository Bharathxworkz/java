package com.xworkz.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ClothsBrand {

    public static void main(String[] args) {

        // List<String> collection = new ArrayList<>();

        Collection<String> collection = new ArrayList<>();
        collection.add("Plush Peach");
        collection.add(" Fluffy Frills");
        collection.add("Rosy Ribbons");
        collection.add("Lilac Laces");
        collection.add("Girly Grapes");

        Collection<String> collection1 = new ArrayList();
        collection1.add("Frosted Flamingo");
        collection1.add("Giggly Goose");
        collection1.add("Darling Daisies");
        collection1.add("Blushing Bows");
        collection1.add("Ruby Roses");

        collection.addAll(collection);


        collection.containsAll(collection);
        collection.addAll(collection1);

        collection.clear();
        collection.remove("Darling Daisies");

        System.out.println(collection.containsAll(collection));
        System.out.println("the collectio size is " + collection.size());

        System.out.println(collection.size());
        // collection.stream().sorted().collect(Collectors.toList());

        boolean isAvailabale = collection.add("Rosy Ribbons");
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