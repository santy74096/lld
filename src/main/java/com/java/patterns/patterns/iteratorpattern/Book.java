package com.java.patterns.patterns.iteratorpattern;

public class Book {

    private String name;
    private int pages;

    public Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }
}
