package com.darp.workshop.domain.model;

import lombok.Builder;

@Builder
public record Book(
        Long id,
        String title,
        String author,
        String isbn,
        Integer publishedYear
) {
}