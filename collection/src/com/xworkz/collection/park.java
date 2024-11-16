package com.xworkz.collection;

import java.util.*;
import java.util.stream.Collectors;

public class park {

    public static void main(String[] args) {

      //  Collection<String> collection = new ArrayList<>();
       //List<String> collection = new ArrayList<>();
        Set<String> collection = new HashSet<>();
        collection.add("null");
      collection.add("null");
      collection.add("null");
      collection.add("null");
      collection.add("Fun World Amusement Park");
        collection.add("Fun World Amusement Park");
        collection.add("Innovative Film City");
        collection.add("Snow City");
        collection.add("GRS Fantasy Parks");
        collection.add("Water World");
        collection.add("SMAAASH");
        collection.add("Fun World Amusement Park");
        collection.add("Neeladri Amusement Park");
        collection.add("Fantasy Lagoon Water Park");

        //collection.add(6,"Snow City");
       // System.out.println(collection.get(10));

      //  String amusmentParkName = collection.get(3);
      //  System.out.println(amusmentParkName);




        Iterator<String>itr = collection.iterator();
     //   System.out.println("List of Amusement park are :");
       while (itr.hasNext()){
           System.out.println(itr.next());
        }

        System.out.println("The list of amusment park are");
        while (itr.hasNext()){
            String amusmentpark = itr.next();
            if (amusmentpark != null)
            if(amusmentpark.startsWith("A"))
                System.out.println(amusmentpark);
        }

        collection.stream().filter(amusmentpark ->amusmentpark.startsWith("A")).collect(Collectors.toList());
        for (String amusementParkName: collection){
            if(amusementParkName != null)
            if(amusementParkName.startsWith("A"))
                System.out.println(amusementParkName);
        }
        System.out.println("---------------");
        collection.forEach( parkName -> System.out.println(parkName));
        System.out.println(collection.stream().filter(parName -> parName.equals("Snow City")).findFirst());
    }
}
