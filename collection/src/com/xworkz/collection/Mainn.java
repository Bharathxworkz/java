package com.xworkz.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Mainn {
    public static void main(String[] args) {
        Set list = new TreeSet<>();
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(9);

        for (Object number : list){
            list.add(100000);
            System.out.println(list);
        }

      //  List<Integer> list1 = list.stream().filter(ref->ref%3==0).collect(Collectors.toList());

      //  System.out.println(list1);
        list.forEach(System.out::println);
    }
}
