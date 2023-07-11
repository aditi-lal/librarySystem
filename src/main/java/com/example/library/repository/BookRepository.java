package com.example.library.repository;

import com.example.library.modal.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

List<Book> findByAuthor(String author);

}
