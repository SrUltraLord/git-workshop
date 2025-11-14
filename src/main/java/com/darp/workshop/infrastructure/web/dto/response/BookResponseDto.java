package com.darp.workshop.infrastructure.web.dto.response;

public record BookResponseDto(
        Long id,
        String title,
        String author,
        String isbn,
        Integer publishedYear
) {
}