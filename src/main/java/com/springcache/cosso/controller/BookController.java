package com.springcache.cosso.controller;


import com.springcache.cosso.dto.request.BookRequestDTO;
import com.springcache.cosso.dto.response.BookResponseDTO;
import com.springcache.cosso.mapper.BookMapper;
import com.springcache.cosso.model.Book;
import com.springcache.cosso.service.BookUseCase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);
    private final BookUseCase bookUseCase;
    private final BookMapper bookMapper;

    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> getAllBooks(){
        log.debug("[BOOK - CONTROLLER] /GET");
        List<Book> booksFounded = bookUseCase.getAllBooks();
        List<BookResponseDTO> response = booksFounded.stream().map(
                bookMapper::toResponseDTO
        ).toList();
        return ResponseEntity.status(
                HttpStatus.OK
        ).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDTO> getBookById(@PathVariable Long id){
        log.debug("[BOOK - CONTROLLER] /GET/{} ", id);
        Book bookFounded = bookUseCase.getBookById(id);
        BookResponseDTO response =  bookMapper.toResponseDTO(bookFounded);
        return ResponseEntity.status(
                HttpStatus.OK
        ).body(response);
    }

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@RequestBody BookRequestDTO body){
        log.debug("[BOOK - CONTROLLER] /POST {}" , body);
        Book newBook = bookMapper.toBook(body);
        newBook = bookUseCase.createBook(newBook);
        BookResponseDTO response = bookMapper.toResponseDTO(newBook);
        return ResponseEntity.status(
                HttpStatus.CREATED
        ).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable Long id){
        log.debug("[BOOK - CONTROLLER] /DELETE/{}", id);
        bookUseCase.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }

}
