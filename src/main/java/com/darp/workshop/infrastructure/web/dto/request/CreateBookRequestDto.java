package com.darp.workshop.infrastructure.web.dto.request;

import jakarta.validation.constraints.*;

public record CreateBookRequestDto(
        @NotBlank(message = "Title is required")
        @Size(min = 1, max = 255, message = "Title must be between 1 and 255 characters")
        String title,
        
        @NotBlank(message = "Author is required")
        @Size(min = 1, max = 255, message = "Author must be between 1 and 255 characters")
        String author,
        
        @NotBlank(message = "ISBN is required")
        @Pattern(regexp = "^(97(8|9))?\\d{9}(\\d|X)$", message = "ISBN format is invalid")
        String isbn,
        
        @NotNull(message = "Published year is required")
        @Min(value = 1000, message = "Published year must be at least 1000")
        @Max(value = 9999, message = "Published year must be at most 9999")
        Integer publishedYear
) {
}