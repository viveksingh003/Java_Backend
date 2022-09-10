package com.collection.arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(11);
        al.add(1);
        al.add(2); al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.add(2,8);
        al.set(2,8);
        System.out.println(al.get(1));
        al.remove(4);
        System.out.println(al.indexOf(5));
        System.out.println(al.lastIndexOf(8));


        //System.out.println(al.capacity); capacity method is not in arraylist
        ArrayList al1=new ArrayList(al);
        al1.add(6);
        System.out.println(al1);


    }
}
