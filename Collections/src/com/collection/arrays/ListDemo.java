package com.collection.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {


        List li = new ArrayList();
        li.add("vivek");
        li.add(0,"singh");
        li.set(1,"setelement");
        System.out.println(li);

        //li.add(9,"hvfgh");// RE -- IndexoutofBound

        System.out.println(li.get(1));
        System.out.println(li.remove(1));

        System.out.println(li);
        System.out.println(li.indexOf("singh"));
        System.out.println(li.lastIndexOf("ingh"));// -1 if element not presnt it will return -1
        //System.out.println(li.set(3,"d"));RE -- IndexoutofBound

    }
}
