package com.darp.workshop.infrastructure.persistence.adapter;

import com.darp.workshop.domain.model.Book;
import com.darp.workshop.domain.port.out.BookRepository;
import com.darp.workshop.infrastructure.persistence.mapper.BookMapper;
import com.darp.workshop.infrastructure.persistence.repository.BookJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Repository
@RequiredArgsConstructor
public class BookRepositoryAdapter implements BookRepository {
    
    private final BookJpaRepository jpaRepository;
    private final BookMapper mapper;

    @Override
    public Mono<Book> save(Book book) {
        return Mono.fromCallable(() -> {
            var entity = mapper.toEntity(book);
            var savedEntity = jpaRepository.save(entity);
            return mapper.toDomain(savedEntity);
        }).subscribeOn(Schedulers.boundedElastic());
    }

    @Override
    public Mono<Book> findById(Long id) {
        return Mono.fromCallable(() -> {
            return jpaRepository.findById(id)
                    .map(mapper::toDomain)
                    .orElse(null);
        }).subscribeOn(Schedulers.boundedElastic());
    }

    @Override
    public Flux<Book> findAll() {
        return Mono.fromCallable(() -> {
            return jpaRepository.findAll()
                    .stream()
                    .map(mapper::toDomain)
                    .toList();
        }).subscribeOn(Schedulers.boundedElastic())
        .flatMapMany(Flux::fromIterable);
    }

    @Override
    public Mono<Book> findByIsbn(String isbn) {
        return Mono.fromCallable(() -> {
            return jpaRepository.findByIsbn(isbn)
                    .map(mapper::toDomain)
                    .orElse(null);
        }).subscribeOn(Schedulers.boundedElastic());
    }

    @Override
    public Mono<Void> deleteById(Long id) {
        return Mono.fromRunnable(() -> {
            jpaRepository.deleteById(id);
        }).subscribeOn(Schedulers.boundedElastic())
        .then();
    }
}