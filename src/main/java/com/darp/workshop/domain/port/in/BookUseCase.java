package com.darp.workshop.domain.port.in;

import com.darp.workshop.domain.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookUseCase {
    Mono<Book> createBook(Book book);
    Mono<Book> getBookById(Long id);
    Flux<Book> getAllBooks();
    Mono<Book> getBookByIsbn(String isbn);
    Mono<Void> deleteBook(Long id);
}