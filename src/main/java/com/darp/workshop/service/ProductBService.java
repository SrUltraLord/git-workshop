package com.darp.workshop.service;

import com.darp.workshop.model.Book;
import org.springframework.stereotype.Service;

@Service
public class ProductBService {
    public Book fetchBookInfo() {
        return Book.builder()
                .title("Cumbres Borrascosas")
                .author("Emily Brontë")
                .isbn("978-84-376-0494-7")
                .publishedYear(1847)
                .build();
    }
}
