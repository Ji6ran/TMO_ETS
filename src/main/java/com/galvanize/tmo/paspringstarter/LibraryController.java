package com.galvanize.tmo.paspringstarter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    bookService service;

    @GetMapping("/health")
    public void health() {

    }

    @GetMapping("api/books")
    public List<Book> getBooks() {
        List<Book> returnVal = service.getAllBooks();
        return returnVal;
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
