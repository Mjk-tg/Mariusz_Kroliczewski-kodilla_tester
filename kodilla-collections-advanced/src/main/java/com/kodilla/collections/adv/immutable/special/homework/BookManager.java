package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;


public class BookManager {

// "zadanie punkty 1 i 2"
//    public Book createBook(String author, String title) {
//       Book book = new Book(author,title);
//       return book;
//    }

    Set<Book> books = new HashSet<>();

    public Book createBook(String author, String title) {
        Book book = new Book(author, title);
        books.add(book);
        return book;
    }
}
