package com.darp.workshop.infrastructure.web.controller;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.domain.port.in.BookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    
    private final BookUseCase bookUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookUseCase.createBook(book);
    }

    @GetMapping("/{id}")
    public Mono<Book> getBookById(@PathVariable Long id) {
        return bookUseCase.getBookById(id);
    }

    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookUseCase.getAllBooks();
    }

    @GetMapping("/isbn/{isbn}")
    public Mono<Book> getBookByIsbn(@PathVariable String isbn) {
        return bookUseCase.getBookByIsbn(isbn);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteBook(@PathVariable Long id) {
        return bookUseCase.deleteBook(id);
    }
}