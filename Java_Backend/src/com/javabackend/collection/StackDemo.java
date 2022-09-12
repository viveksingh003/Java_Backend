package com.javabackend.collection;

import java.util.ArrayList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) { // LIFO
        ArrayList a=new ArrayList<>();
        Stack s =new Stack(); // only one constructor -- not even collection we can provide in parameter.
        s.push("abvcc");
        s.push("hgjh"); // last element will become first element
        System.out.println(s);
        s.pop(); // will remove hgjh
        System.out.println(s);
        s.add("ddd");

        System.out.println(s.peek());// return ddd
        System.out.println(s.search("abvcc")); // index will be -> 2

    }
}
