package com.javabackend.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo { // only forward --applies to all collection

    public static void main(String[] args) {

        ArrayList al= new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        Iterator it=al.iterator();

        while(it.hasNext()){

            if(it.next().equals(1)){
                it.remove();
            }




        }
        for(Object x:al){
            System.out.println(x);
        }
        System.out.println(al);

    }
}
