package com.collection.arrays;

public class AnonymousArray {

    static void sumOfArray(int[] a) {
        int sum = 0;
        for (int x : a) {

            sum = sum + x;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfArray(new int[]{10, 20, 30});
    }
}
