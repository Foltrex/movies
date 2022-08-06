package com.cinema.movies.service;

import com.cinema.movies.domain.Identifiable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Service<T extends Identifiable<S>, S> {
    Page<T> findAll();

    Page<T> findAll(Pageable pageable);

    T findById(S id);

    void save(T item);

    void delete(T item);

    long count();
}
