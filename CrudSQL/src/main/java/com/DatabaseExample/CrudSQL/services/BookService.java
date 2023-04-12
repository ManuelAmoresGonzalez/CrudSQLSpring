package com.DatabaseExample.CrudSQL.services;

import com.DatabaseExample.CrudSQL.model.Book;
import com.DatabaseExample.CrudSQL.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public List<Book> getAllBooks(){
        return repository.getAllBooks();
    }

    public long createBook(Book newBook) {
        return repository.createBook(newBook);
    }
}
