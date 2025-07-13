package com.springcache.cosso.controller;


import com.springcache.cosso.dto.request.BookRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public ResponseEntity<List<Book>> getAllBook(){
        log.debug("[BOOK - CONTROLLER] STARTING /GET");
        return ResponseEntity.status(
                HttpStatus.OK
        ).body(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        log.debug("[BOOK - CONTROLLER] STARTING /GET/{} ", id);
        return ResponseEntity.status(
                HttpStatus.OK
        ).body(null);
    }

    @PostMapping
    public ResponseEntity<Void> createBook(@RequestBody BookRequestDTO newBook){
        log.debug("[BOOK - CONTROLLER] STARTING /POST {}" , newBook);
        return ResponseEntity.status(
                HttpStatus.OK
        ).body(null);
    }
}
