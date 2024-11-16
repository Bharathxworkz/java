package com.xworkz.collection;

import java.util.*;
import java.util.stream.Collectors;



public class MapSortingExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(1);
        map.put(1, "Bharath L");
        map.put(2, "Sagar");
        map.put(3, "Sai");
        map.put(4, "Abhilash");

        System.out.println("Original Map:");
        map.forEach((k, v) -> System.out.println(k + " " + v));


        Map<Integer, String> sortedById = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("\nSorted by ID (Key):");
        sortedById.forEach((k, v) -> System.out.println(k + " " + v));

        Map<Integer, String> sortedByName = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey()) //Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("\nSorted by Name (Value):");
        sortedByName.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
