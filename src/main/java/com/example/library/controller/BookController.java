package com.example.library.controller;

import com.example.library.modal.Book;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/booksById/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") Integer bookId){
        System.out.println(bookId);
        return new ResponseEntity<>(bookService.getBook(bookId), HttpStatus.OK);
    }

    @GetMapping("/books")
    public ResponseEntity<Iterable<Book>> getAllBooks(){

         return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
    }

    @GetMapping("/searchBook")
    public ResponseEntity<List<Book>> searchBook(@RequestParam("author") String authorName){
        return new ResponseEntity<>(bookService.searchBookByAuthor(authorName), HttpStatus.OK);
    }
}
