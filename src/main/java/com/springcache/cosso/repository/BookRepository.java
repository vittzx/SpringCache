package com.springcache.cosso.repository;

import com.springcache.cosso.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
