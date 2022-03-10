package com.galvanize.tmo.paspringstarter;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class bookService {
    int id = 1;

    List<Book> books = new ArrayList<>();
    Book[] array = new Book[3];

    public Book[] getAllBooks() {
        return array;
    }

    public void clearBooks() {
        for (int i = 0; i < array.length; ++i) {
            array[i] = null;
        }
    }

    public Book addBook(Book newBook) {
        newBook.setId(id);
        id++;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == null) {
                array[i] = newBook;
                break;
            }
        }
        return newBook;
    }
}
