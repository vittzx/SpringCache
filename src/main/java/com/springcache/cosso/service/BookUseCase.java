package com.springcache.cosso.service;

import com.springcache.cosso.model.Book;

import java.util.List;

public interface BookUseCase {

    Book createBook(Book newBook);

    Book getBookById(Long id);

    List<Book> getAllBooks();
}
