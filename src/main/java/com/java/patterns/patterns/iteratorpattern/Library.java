package com.java.patterns.patterns.iteratorpattern;

import java.util.List;

public class Library implements Aggregator{

    List<Book> books;

    public Library(List<Book> books){
        this.books = books;
    }

    @Override
    public Iterator createItr() {
        return new BookIterator(books);
    }
}
