package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionRunner {

    public static  void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);


        for (Integer integer: collection){
            if(integer%2 ==0)
                System.out.println(integer);
        }
      //  integerwithoddNumber
       //collection.stream().filter(i ->(i % 2 !=0)).forEach(System.out::println);

        List<Integer> integerwithoddNumber = collection.stream().filter(i ->(i % 2 != 0)).collect(Collectors.toList());
        integerwithoddNumber.forEach(System.out::println);
        System.out.println(collection);
    }
}
