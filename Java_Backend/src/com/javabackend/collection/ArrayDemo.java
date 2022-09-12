package com.javabackend.collection;

public class ArrayDemo {

    public static void main(String[] args) {

        int a[] = {10, 20, 110};
        System.out.println(a[1]);

        int b[] = new int[5];
        b[1] = 10;

        //iteration with normal for loop

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-----");
        // iteration with FOR EACH
        for (int x : a) {
            System.out.println(x);
        }

        System.out.println("______");
        //While loop
        int i = 0;
        while (i < a.length) {
            System.out.println(a[i]);
            i++;
        }

        System.out.println("__---");
        int j = 0;
        do {
            System.out.println(a[j]);
            j++;
        } while (j < a.length);

    }
}
