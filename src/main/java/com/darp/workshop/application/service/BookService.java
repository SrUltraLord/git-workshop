package com.darp.workshop.application.service;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.domain.port.in.BookUseCase;
import com.darp.workshop.domain.port.out.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BookService implements BookUseCase {
    
    private final BookRepository bookRepository;

    @Override
    public Mono<Book> createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Mono<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Mono<Book> getBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public Mono<Void> deleteBook(Long id) {
        return bookRepository.deleteById(id);
    }
}