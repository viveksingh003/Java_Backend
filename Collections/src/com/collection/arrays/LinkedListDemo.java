package com.collection.arrays;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();// no capacity constructor
        ll.add("aaa");
        ll.add("bbb");
        System.out.println(ll);
        ll.addFirst("abc");// add to first index , also addLast
        System.out.println(ll);
        System.out.println(ll.getFirst()); //-- return  first object, also getLast()
        System.out.println(ll.removeFirst());
        ll.removeLast();
        System.out.println(ll);

    }
}
