package com.reymatsunaga.mysqlcrud.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "books.books")
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String bookName;

    @NotBlank
    private String authorName;

    @NotBlank
    private String isbn;

    public Book() {
        super();
    }
    public Book(Long id, String bookName, String authorName, String isbn) {
        super();
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn=isbn;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
