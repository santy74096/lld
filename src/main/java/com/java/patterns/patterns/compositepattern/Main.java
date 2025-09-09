package com.java.patterns.patterns.compositepattern;

public class Main {

    public static void main(String[] args) {
        Directory movies = new Directory("Movies");
        File pocMovie = new File("POCS");
        movies.add(pocMovie);
        Directory actionMovies = new Directory("action");
        File actionMovie = new File("Jason Bourne");
        actionMovies.add(actionMovie);

        movies.add(actionMovies);


        actionMovie.ls();
    }
}
