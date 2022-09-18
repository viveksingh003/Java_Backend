package com.javabackend.predicateandfunctions;

import java.util.function.Function;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str= "Vivek Kumar Singh";
        Function<String, String> f=func->func.replaceAll(" ","");
        System.out.println(f.apply(str));

    }


}
