package com.springcache.cosso.mapper;

import com.springcache.cosso.dto.request.BookRequestDTO;
import com.springcache.cosso.dto.response.BookResponseDTO;
import com.springcache.cosso.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMapper {

    BookResponseDTO toResponseDTO(Book book){
        return BookResponseDTO
                .builder()
                .id(book.getId())
                .name(book.getName())
                .author(book.getAuthor())
                .category(book.getCategory())
                .edition(book.getEdition())
                .publisher(book.getPublisher())
                .build();
    }

    Book toBook(BookRequestDTO requestDTO){
        return Book
                .builder()
                .id(requestDTO.getId())
                .name(requestDTO.getName())
                .author(requestDTO.getAuthor())
                .category(requestDTO.getCategory())
                .edition(requestDTO.getEdition())
                .publisher(requestDTO.getPublisher())
                .build();
    }
}
