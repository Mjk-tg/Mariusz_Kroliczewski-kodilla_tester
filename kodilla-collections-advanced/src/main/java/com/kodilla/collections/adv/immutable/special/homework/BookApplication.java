package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("H. Sienkiewicz","W pustyni i w puszczy");
        Book book2 = bookManager.createBook("H. Sienkiewicz","Ogniem i mieczem");
        Book book3 = bookManager.createBook("St. Lem","Cyberiada");
        Book book3Prim = bookManager.createBook("St. Lem","Cyberiada");

        System.out.println(book1==book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1==book3);
        System.out.println(book1.equals(book3));
        System.out.println(book2==book3);
        System.out.println(book2.equals(book3));
        System.out.println(book3Prim==book3);
        System.out.println(book3Prim.equals(book3));
        System.out.println(book3.hashCode());
        System.out.println(book3Prim.hashCode());
        System.out.println("   ");

        for (Book collectedBooks:bookManager.books) {
            System.out.println( "Autor: " + collectedBooks.getAuthor() + ", tytuł: " + collectedBooks.getTitle() + "adres" +collectedBooks);
        }
        if (bookManager.books.size()>1) {
            for (int n=0; n<bookManager.books.size(); n++){
                for (int i=n+1; i<bookManager.books.size(); i++)
                    if ((bookManager.books.get(n).equals(bookManager.books.get(i))) && ((bookManager.books.get(n).hashCode() == bookManager.books.get(i).hashCode()))) {
                        System.out.println("  ");
                        System.out.println("Adres: " +bookManager.books.get(n) +" ksiązki o indeksie " + n + " == "+ "Adres: " + bookManager.books.get(i) +" ksiązki o indeksie " + i );
                    }
            }
        }
    }
}
