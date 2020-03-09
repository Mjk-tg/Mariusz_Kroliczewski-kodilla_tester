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
        Book lastAddedBook = book;
        if (books.size()>0){
            ifCollectionContainsThisBook(lastAddedBook);
        }
        books.add(book);
        return book;
    }

    public void ifCollectionContainsThisBook(Book lastAddedBook){
        for (Book book:books
             ) {if (book.equals(lastAddedBook) && book.hashCode()==lastAddedBook.hashCode()) {
                    System.out.println( "-----------------------------------------------------");
                    System.out.println("You are adding the same book again. Book " + lastAddedBook.getTitle() + " written by " + lastAddedBook.getAuthor());
                    if (book.equals(lastAddedBook)) {
                        System.out.println("Address: " + book + " , of book inside the collection is identical to address: " + lastAddedBook +" of book you trying to add ");}
                        System.out.println( "  ");
            }
        }
    }
}
