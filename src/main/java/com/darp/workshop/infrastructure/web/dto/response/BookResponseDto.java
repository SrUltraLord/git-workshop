package com.darp.workshop.infrastructure.web.dto.response;

import lombok.Builder;

@Builder
public record BookResponseDto(
        Long id,
        String title,
        String author,
        String isbn,
        Integer publishedYear
) {
}