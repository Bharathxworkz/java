package com.xworkz.collection;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("park");
        linkedlist.addFirst("amazonpark");
        linkedlist.addLast("vijaynagarapark");
      String in= linkedlist.get(0);
        System.out.println(in);
        System.out.println(linkedlist);
    }
}
