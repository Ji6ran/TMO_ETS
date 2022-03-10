package com.galvanize.tmo.paspringstarter;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class bookService {
    int id = 1;

    List<Book> books = new ArrayList<>();

    public String getAllBooks() {
        Collections.sort(books, new Comparator<Book>() {
            @Override public int compare(Book p1, Book p2) {
                return p2.getAuthor().compareTo(p1.getAuthor());
            }
        });
        String json = new Gson().toJson(books);
        return json;
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
