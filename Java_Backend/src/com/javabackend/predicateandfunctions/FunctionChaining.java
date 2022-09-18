package com.javabackend.predicateandfunctions;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
String str ="viveksingh";
        Function<String ,String> f= func->func.toUpperCase();
        Function<String ,String >f2=func->func.substring(0,5);

        System.out.println(f.andThen(f2).apply(str));

        System.out.println(f.compose(f2).apply(str));


    }

}
