package com.xworkz.collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        LinkedList<Integer> arrayDeque =new LinkedList<>();
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(4);

       // arrayDeque.poll();
        System.out.println( arrayDeque.peek());
        System.out.println(arrayDeque);

    }
}
