package com.javabackend.collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v= new Vector(12);
        v.add(2);
        v.add(3);
        v.add(5);
        v.add(78);
        v.add(2);
        v.add(3);
        v.add(5);
        v.add(78);
        v.add(2);
        v.add(3);
        v.add(5);
        v.add(78);
        v.add(2);// on adding 13th elemnet, capacity will become 2x of initial capacity

        System.out.println(v.capacity());// capacity method available in vector

    }
}
