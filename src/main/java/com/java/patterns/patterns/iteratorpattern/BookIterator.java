package com.java.patterns.patterns.iteratorpattern;

import java.util.List;

public class BookIterator implements Iterator{

    List<Book> books;
    int index = 0;

    public BookIterator(List<Book> books){
        this.books = books;
    }

    @Override
    public boolean hasNext() {

        return index < books.size();
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return books.get(index++);
        }
        return null;
    }
}
