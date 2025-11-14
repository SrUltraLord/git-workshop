package com.darp.workshop.domain.port.out;

import com.darp.workshop.domain.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookRepository {
    Mono<Book> save(Book book);
    Mono<Book> findById(Long id);
    Flux<Book> findAll();
    Mono<Book> findByIsbn(String isbn);
    Mono<Void> deleteById(Long id);
}