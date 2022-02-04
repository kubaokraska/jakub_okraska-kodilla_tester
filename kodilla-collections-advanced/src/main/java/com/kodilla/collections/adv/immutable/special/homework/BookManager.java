package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    private static Set<Book> bookCollection = new HashSet<>();

    public static Book createBook(String title, String author) {
        int bookSize = bookCollection.size();
        Book book = new Book(title, author);
        bookCollection.add(book);

        if (bookSize == bookCollection.size()) {
            System.out.println("This book already exist");
            for (Book books : bookCollection)
                if (book.getTitle() == books.getTitle() && book.getAuthor() == books.getAuthor()) // da sie prosciej????
                    return books;

            return book;
        } else
            return book;
    }

    public static int getCollectionSize() {
        return bookCollection.size();
    }
}