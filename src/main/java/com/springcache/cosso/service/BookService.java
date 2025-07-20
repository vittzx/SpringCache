package com.springcache.cosso.service;

import com.springcache.cosso.controller.BookController;
import com.springcache.cosso.model.Book;
import com.springcache.cosso.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService  implements BookUseCase{

    private static final Logger log = LoggerFactory.getLogger(BookService.class);
    private final BookRepository bookRepository;

    @Override
    public Book createBook(Book newBook) {
        log.info("[BOOK - SERVICE] Persisting new book {}", newBook);
        return bookRepository.save(newBook);
    }

    @Override
    public Book getBookById(Long id) {
        log.info("[BOOK - SERVICE] Getting book by id {}", id);
        return bookRepository.getReferenceById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        log.info("[BOOK - SERVICE] Getting all books");
        return bookRepository.findAll();
    }
}
