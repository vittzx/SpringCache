package com.springcache.cosso.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BOOKS")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "BOOK_NAME")
    private String name;

    @Column(name = "BOOK_CATEGORY")
    private String category;

    @Column(name = "BOOK_AUTHOR")
    private String author;

    @Column(name = "PUBLISHER")
    private String publisher;

    @Column(name = "EDITION")
    private Integer edition;
}
