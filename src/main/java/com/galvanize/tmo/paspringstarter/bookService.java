package com.galvanize.tmo.paspringstarter;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class bookService {
    int id = 1;

    List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        Collections.sort(books, new Comparator<Book>() {
            @Override public int compare(Book p1, Book p2) {
                return p2.getAuthor().compareTo(p1.getAuthor()); // Ascending
            }
        });

        return books;
    }

    public void clearBooks() {
        books.clear();
    }

    public Book addBook(Book newBook) {
        newBook.setId(id);
        id++;
        books.add(newBook);
        return newBook;
    }
}