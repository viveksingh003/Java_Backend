package com.javabackend.consumersupplier;

public class Movie {
    String movName;
    String actor;
    String actress;

    public Movie(String movName, String actor, String actress) {
        this.movName = movName;
        this.actor = actor;
        this.actress = actress;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movName='" + movName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                '}';
    }
}
