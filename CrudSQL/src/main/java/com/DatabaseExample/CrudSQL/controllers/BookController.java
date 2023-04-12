package com.DatabaseExample.CrudSQL.controllers;

import com.DatabaseExample.CrudSQL.model.Book;
import com.DatabaseExample.CrudSQL.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String hello() {
        return "Hi there";
    }

    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
