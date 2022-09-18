package com.javabackend.predicateandfunctions;

import java.util.function.Function;

public class NumberOfSpaces {

    public static void main(String[] args) {

        String str= " vivek kumar singh ";
        Function<String,Integer> f=func->(str.length()-(str.replaceAll(" ","").length()));

        System.out.println(f.apply(str));

    }
}
