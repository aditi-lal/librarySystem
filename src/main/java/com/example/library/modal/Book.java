package com.example.library.modal;

import jakarta.persistence.*;
import org.hibernate.annotations.Columns;


@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    Integer bookId;

    @Column(name = "NAME")
    String name;

    @Column(name = "AUTHOR")
    String author;

    @Column(name = "ISBN")
    String isbn;

    @Column(name = "PRICE")
    Float price;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String toString(){
        return "Book with id"+bookId+" name"+name;
    }


}
