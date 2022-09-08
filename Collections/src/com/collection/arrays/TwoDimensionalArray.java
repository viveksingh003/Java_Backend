package com.collection.arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int a[][]={{10,20},{30,2},{10}};

        System.out.println(a);//[[I@11231
        System.out.println(a[0]);//[I@121
        System.out.println("--for----");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------for each-----");
        for(int[] x:a){
            for(int b:x){
                System.out.print(b+" ");

            }
            System.out.println();
        }



    }
}
