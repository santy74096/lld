package com.java.patterns.patterns.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", 100));
        books.add(new Book("Lord of the Rings", 150));
        books.add(new Book("Game of thrones", 200));

        Library library = new Library(books);
        Iterator itr = library.createItr();

        while(itr.hasNext()){
            Book book = (Book) itr.next();
            System.out.println(book.getName() + " has " + book.getPages());
        }

        System.out.println(itr.next());
    }
}
