package com.collection.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionCommonMethods {

    public static void main(String[] args) {


        System.out.println("add(Object o)");
        HashSet hs = new HashSet();
        System.out.println(hs.add(1)); // return type boolean
        hs.add("a");
        hs.add(2);
        hs.add(1.2);

        System.out.println(hs); // not follow indexing --based o hash code value
        System.out.println("addll(Collection o)");
        ArrayList arr = new ArrayList();
        arr.add("aaa");
        arr.addAll(hs);
        arr.add(111);
        System.out.println(arr); // follow insertion order and indexing

        System.out.println("remove(Object o)");

        hs.remove("a"); /// as it already removed from hs but arr have it
        System.out.println(hs);

        System.out.println("removeAll(Collection o)");

        arr.removeAll(hs);
        System.out.println(arr); // when removing hs .. arr will have "a".

        System.out.println("contains(Object o)");

        System.out.println(hs.contains(2));

        System.out.println("containsAll(Collection o)");
        System.out.println(arr.containsAll(hs));

        System.out.println("retainAll(Collection o)");
        arr.addAll(hs);
        System.out.println(arr.retainAll(hs));
        System.out.println(arr);












    }
}
