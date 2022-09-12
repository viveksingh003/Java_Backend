package com.javabackend.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class LitIteratorDEmo { // Applicable to list only
    public static void main(String[] args) {
        ArrayList s=new ArrayList();
        s.add(1);
        s.add(2);
        s.add(3);
        ListIterator l=s.listIterator();
        while(l.hasNext()){
            System.out.println(l.nextIndex()+" "+l.next()); // index strt from 0
        }
        System.out.println();
        while(l.hasPrevious()){
            System.out.println(l.nextIndex()+" "+l.previous()); ///from last index count --- 3,2 , 1
        }


    }
}
