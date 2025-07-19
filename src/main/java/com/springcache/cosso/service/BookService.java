package com.springcache.cosso.service;

import com.springcache.cosso.model.Book;
import com.springcache.cosso.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService  implements BookUseCase{

    private BookRepository bookRepository;

    @Override
    public Book createBook(Book newBook) {
        return bookRepository.save(newBook);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.getReferenceById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
