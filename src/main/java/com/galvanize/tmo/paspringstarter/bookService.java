package com.galvanize.tmo.paspringstarter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.json.GsonJsonParser;
import com.galvanize.tmo.paspringstarter.AllBooks;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class bookService {
    int id = 1;
    List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        Collections.sort(books, new Comparator<Book>() {
            @Override public int compare(Book p1, Book p2) {
                return p1.getTitle().compareTo(p2.getTitle());
            }
        });
        return books;
    }

    public void clearBooks() {
        books.removeAll(books);
    }

    public Book addBook(Book newBook) {
        newBook.setId(id);
        id++;
        books.add(newBook);
        return newBook;
    }
}
