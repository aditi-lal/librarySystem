package com.example.library.service;

import com.example.library.modal.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getAllBook(){
        Iterable<Book> data = bookRepository.findAll();
        System.out.println(data);
        return data;
    }
    public Book getBook(Integer id){
        Book data = bookRepository.findById(id).get();
        System.out.println(data.toString());
        return data;
    }

    public List<Book> searchBookByAuthor(String authorName) {
        return bookRepository.findByAuthor(authorName);
    }
}
