package com.reymatsunaga.mysqlcrud.controller;

import com.reymatsunaga.mysqlcrud.dao.BookDao;
import com.reymatsunaga.mysqlcrud.exception.BookNotFoundException;
import com.reymatsunaga.mysqlcrud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookDao bookDao;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @PostMapping("/books")
    public Book createBook(@Valid @RequestBody Book book) {
        return bookDao.save(book);
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable(value = "id") Long bookId,
                            @Valid @RequestBody Book bookDetails)
    throws BookNotFoundException {
        Book book = bookDao.findById(bookId)
                        .orElseThrow(() -> new
                                BookNotFoundException(bookId));
        book.setBookName(bookDetails.getBookName());
        book.setAuthorName(bookDetails.getAuthorName());
        book.setIsbn(bookDetails.getIsbn());

        Book updatedBook = bookDao.save(book);

        return updatedBook;
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
        Book book = bookDao.findById(bookId)
                        .orElseThrow(() -> new BookNotFoundException(bookId));

        bookDao.delete(book);

        return ResponseEntity.ok().build();
    }

}
