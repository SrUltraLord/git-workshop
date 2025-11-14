package com.darp.workshop.service;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.domain.port.in.BookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductBService {
    
    private final BookUseCase bookUseCase;
    
    public Mono<Book> fetchBookInfo() {
        Book sampleBook = new Book(
                null,
                "Cumbres Borrascosas",
                "Emily Brontë",
                "978-84-376-0494-7",
                1847
        );
        
        return bookUseCase.createBook(sampleBook);
    }
}
