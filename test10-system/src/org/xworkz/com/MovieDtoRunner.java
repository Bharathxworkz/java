package org.xworkz.com;

import java.util.ArrayList;
import java.util.List;

public class MovieDtoRunner {
    public static void main(String[] args) {


        List list = new ArrayList();
        MovieDto movieDto = new MovieDto(1, "Bahubali", 5.0);
        MovieDto movieDto2 = new MovieDto(2, "Bahubali2", 5.0);
        list.add(movieDto);
        list.add(movieDto2);
        List list1 = new ArrayList();
        MovieDto movieDto4 = new MovieDto(1, "Bahubali", 5.0);
        MovieDto movieDto3 = new MovieDto(2, "Bahubali2", 5.0);
        list1.add(movieDto3);
        list1.add(movieDto4);
        list1.addAll(list);
        System.out.println(  list1.contains("Bahubali"));
        System.out.println( list1.size());
        System.out.println( list.removeAll(list1));
        list1.clear();
        list1.forEach(System.out::println);

    }
}
