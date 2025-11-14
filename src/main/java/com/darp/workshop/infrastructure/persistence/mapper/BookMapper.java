package com.darp.workshop.infrastructure.persistence.mapper;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.infrastructure.persistence.entity.BookEntity;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    
    public Book toDomain(BookEntity entity) {
        return Book.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .author(entity.getAuthor())
                .isbn(entity.getIsbn())
                .publishedYear(entity.getPublishedYear())
                .build();
    }
    
    public BookEntity toEntity(Book domain) {
        return BookEntity.builder()
                .id(domain.id())
                .title(domain.title())
                .author(domain.author())
                .isbn(domain.isbn())
                .publishedYear(domain.publishedYear())
                .build();
    }
}