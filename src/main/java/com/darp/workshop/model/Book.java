package com.darp.workshop.model;

import lombok.Builder;

@Builder
public record Book(
        String title,
        String author,
        String isbn,
        Integer publishedYear
) {
}
