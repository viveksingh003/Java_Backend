package com.javabackend.consumersupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieDisplay {

    public static void main(String[] args) {

        ArrayList<Movie> mov=new ArrayList<>();
        populate(mov);

        Consumer<Movie> m=mo-> {System.out.print(mo.movName+" ");
            System.out.print(mo.actor+" ");
            System.out.print(mo.actress);};
        for (Movie movie:mov){
            m.accept(movie);
            System.out.println();

        }


    }
    public static void populate(ArrayList<Movie> m){
        m.add(new Movie("ABCD","Varun","Shraddha"));
        m.add(new Movie("Dhoni","Sushant","Disha"));
        m.add(new Movie("YJHD","Ranbir","Deepika"));


    }

}
