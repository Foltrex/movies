package com.cinema.movies.service.impl;

import com.cinema.movies.dao.MovieDao;
import com.cinema.movies.domain.Movie;
import com.cinema.movies.service.MovieService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Page<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Page<Movie> findAll(Pageable pageable) {
        return movieDao.findAll(pageable);
    }

    @Override
    public Movie findById(Long id) {
        return movieDao.findById(id);
    }

    @Override
    public void save(Movie item) {
        movieDao.save(item);
    }

    @Override
    public void delete(Movie item) {
        movieDao.delete(item);
    }

    @Override
    public long count() {
        return movieDao.count();
    }
}
