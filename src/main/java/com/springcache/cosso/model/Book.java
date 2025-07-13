package com.springcache.cosso.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BOOKS")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
