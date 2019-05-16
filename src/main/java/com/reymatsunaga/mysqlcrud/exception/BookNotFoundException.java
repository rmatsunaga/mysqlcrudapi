package com.reymatsunaga.mysqlcrud.exception;

public class BookNotFoundException extends Exception {
    private long bookId;

    public BookNotFoundException(long bookId) {
        super(String.format("book is not found with id : '%s'", bookId));
    }
}
