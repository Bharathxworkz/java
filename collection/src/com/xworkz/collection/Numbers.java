package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(180);
        list.add(200);
        list.add(600);
        list.add(5000);
        list.add(62);
      List<Integer> integerList=list.stream().filter(ref->ref%3==0).collect(Collectors.toList());

     List<Integer>integers= list.stream().filter(ref-> ref%2==0).collect(Collectors.toList());
        System.out.println(integers);

        System.out.println(integerList);
        System.out.println( list.stream().filter(ref-> ref%5==0).collect(Collectors.toList()));
        System.out.println( list.stream().filter( num -> num>100&&num<300).collect(Collectors.toList()));
    }
}
