package com.darp.workshop.infrastructure.web.mapper;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.infrastructure.web.dto.request.CreateBookRequestDto;
import com.darp.workshop.infrastructure.web.dto.response.BookResponseDto;
import org.springframework.stereotype.Component;

@Component
public class BookDtoMapper {
    
    public Book toDomain(CreateBookRequestDto requestDto) {
        return Book.builder()
                .title(requestDto.title())
                .author(requestDto.author())
                .isbn(requestDto.isbn())
                .publishedYear(requestDto.publishedYear())
                .build();
    }
    
    public BookResponseDto toResponseDto(Book book) {
        return BookResponseDto.builder()
                .id(book.id())
                .title(book.title())
                .author(book.author())
                .isbn(book.isbn())
                .publishedYear(book.publishedYear())
                .build();
    }
}