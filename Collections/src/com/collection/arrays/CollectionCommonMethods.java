package com.collection.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class CollectionCommonMethods {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("add(Object o)");
        System.out.println();
        HashSet hs = new HashSet();
        System.out.println(hs.add(1)); // return type boolean
        hs.add("a");
        hs.add(2);
        hs.add(1.2);

        System.out.println(hs); // not follow indexing --based o hash code value
        System.out.println();
        System.out.println("addll(Collection o)");
        System.out.println();
        ArrayList arr = new ArrayList();
        arr.add("aaa");
        arr.addAll(hs);
        arr.add(111);
        System.out.println(arr); // follow insertion order and indexing
        System.out.println();
        System.out.println("remove(Object o)");
        System.out.println();
        hs.remove("a"); /// as it already removed from hs but arr have it
        System.out.println(hs);
        System.out.println();
        System.out.println("removeAll(Collection o)");
        System.out.println();
        arr.removeAll(hs);
        System.out.println(arr); // when removing hs .. arr will have "a".
        System.out.println();
        System.out.println("contains(Object o)");
        System.out.println();
        System.out.println(hs.contains(2));
        System.out.println();
        System.out.println("containsAll(Collection o)");
        System.out.println();
        System.out.println(arr.containsAll(hs));
        System.out.println();
        System.out.println("retainAll(Collection o)");
        System.out.println();
        arr.addAll(hs);
        System.out.println(arr.retainAll(hs));
        System.out.println(arr);


        System.out.println();
        System.out.println("______________________________");
        System.out.println();
        System.out.println("return integer --size()");
        System.out.println();
        System.out.println(arr.size());
        System.out.println();
        System.out.println("remove all in collection al.clear()____return type void");
        System.out.println();
        hs.clear();
        System.out.println();
        System.out.println("isEmpty()--return true/false");
        System.out.println();
        System.out.println();

        boolean nb=hs.isEmpty();
        System.out.println(nb);

        System.out.println();
        System.out.println("IMPOOOOOO");
        System.out.println();

        System.out.println();
        System.out.println("Collection to Object[]");
        System.out.println();

        Object[] obj=arr.toArray();
        for(Object o:obj){
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("END");


        Collection col=new ArrayList();
        col.add(11);
       // System.out.println(col.get(3));//col.get(3) ---can use only parent methods



        ArrayList al=new ArrayList();
        col.add(11);
        System.out.println(al.get(3));












    }
}
