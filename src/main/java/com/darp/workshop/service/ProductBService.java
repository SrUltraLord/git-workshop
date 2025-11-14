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
        Book sampleBook = Book.builder()
                .title("Cumbres Borrascosas")
                .author("Emily Brontë")
                .isbn("978-84-376-0494-7")
                .publishedYear(1847)
                .build();
        
        return bookUseCase.createBook(sampleBook);
    }
}
