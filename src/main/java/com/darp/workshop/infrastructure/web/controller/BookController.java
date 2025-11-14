package com.darp.workshop.infrastructure.web.controller;

import com.darp.workshop.domain.port.in.BookUseCase;
import com.darp.workshop.infrastructure.web.dto.request.CreateBookRequestDto;
import com.darp.workshop.infrastructure.web.dto.response.BookResponseDto;
import com.darp.workshop.infrastructure.web.mapper.BookDtoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {
    
    private final BookUseCase bookUseCase;
    private final BookDtoMapper dtoMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<BookResponseDto> createBook(@Valid @RequestBody CreateBookRequestDto requestDto) {
        return Mono.just(requestDto)
                .map(dtoMapper::toDomain)
                .flatMap(bookUseCase::createBook)
                .map(dtoMapper::toResponseDto);
    }

    @GetMapping
    public Flux<BookResponseDto> getAllBooks() {
        return bookUseCase.getAllBooks()
                .map(dtoMapper::toResponseDto);
    }
}