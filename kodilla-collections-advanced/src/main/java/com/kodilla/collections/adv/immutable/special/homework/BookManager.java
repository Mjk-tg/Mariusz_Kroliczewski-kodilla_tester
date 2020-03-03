package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookManager {

// "zadanie punkty 1 i 2"
//    public Book createBook(String author, String title) {
//       Book book = new Book(author,title);
//       return book;
//    }

    List <Book> books = new ArrayList<>();

    public Book createBook(String author, String title) {
        Book book = new Book(author, title);
        books.add(book);
        if (books.size()>0){
            ifCollectionContainsThisBook(author, title);
        }
        return book;
    }

    public void ifCollectionContainsThisBook(String author, String title){
        for (int n=0;n<(books.size()-1); n++) {
                if (books.get(books.size() - 1).getAuthor().equals(author) && books.get(n).getTitle().equals(title)) {
                    System.out.println( "-----------------------------------------------------");
                    System.out.println("You adding the same book again. Book " + books.get(n).getTitle() + " written by " + books.get(n).getAuthor());
                    System.out.println( "  ");
                }
        }
    }
}
