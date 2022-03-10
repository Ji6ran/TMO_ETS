package com.galvanize.tmo.paspringstarter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    bookService service;

    @GetMapping("/health")
    public void health() {

    }

    @GetMapping("api/books")
    public String getBooks() {
        List<Book> list = service.getAllBooks();
        JSONObject obj = new JSONObject().put("books", new JSONArray(list));
        return obj.toString();
    }

    @PostMapping("api/books")
    public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
        Book book = service.addBook(newBook);
        return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }

    @DeleteMapping("api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBooks() {
        service.clearBooks();
    }
}
