package com.darp.workshop.infrastructure.web.mapper;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.infrastructure.web.dto.request.CreateBookRequestDto;
import com.darp.workshop.infrastructure.web.dto.response.BookResponseDto;
import org.springframework.stereotype.Component;

@Component
public class BookDtoMapper {
    
    public Book toDomain(CreateBookRequestDto requestDto) {
        return new Book(
                null, // ID will be generated
                requestDto.title(),
                requestDto.author(),
                requestDto.isbn(),
                requestDto.publishedYear()
        );
    }
    
    public BookResponseDto toResponseDto(Book book) {
        return new BookResponseDto(
                book.id(),
                book.title(),
                book.author(),
                book.isbn(),
                book.publishedYear()
        );
    }
}