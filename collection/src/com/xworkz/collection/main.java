package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class main {

    //Array store exception
    public static void main(String[] args) {

        // String str[] = new String[3];

        Collection<String> collection = new ArrayList();
        Collection<String> collection1 = new ArrayList();
        collection1.add("Galaxy");
        collection1.add("mach");
        collection1.add("Temptatio");

        //  Object e = new String();

        collection.add("Dairy Milk");
        collection.add("FiveStar");
        collection.add("Amul");
        collection.add("Ferrero Rocher");
        collection.add("KitKat");
       // collection.retainAll(collection);

        //Retrive a obj from collection
        Iterator<String>itr = collection.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
     /*  collection.clear();
        collection.remove("KitKat");

        collection.containsAll(collection);
      collection.addAll(collection1);

        System.out.println(collection.containsAll(collection));
        System.out.println("the collectio size is "+ collection.size());

       System.out.println(collection.size());
        collection.stream().sorted().collect(Collectors.toList());

     boolean isAvailabale = collection.add("mango");
        System.out.println(isAvailabale);


        System.out.println(collection);

           //Retrive the collection object
        collection.forEach(System.out::println);
      for (Object st: collection){
           System.out.println((String)st);
        }*/

    }
}
















     //  Object[] objects = new Customer[2];
      /*   Customer customer = new Customer();
        customer.setId(1);
        objects[0] = customer;
        Customer customer1 = new Customer();
        customer1.setId(2);
        objects[1] = customer1;*/

        //Object[] obj = {"baba",new Customer()};

        //System.out.println(obj[0] + " " + obj[1]);
