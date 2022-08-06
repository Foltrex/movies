package com.cinema.movies.service.impl;

import com.cinema.movies.dao.GenreDao;
import com.cinema.movies.domain.Genre;
import com.cinema.movies.service.GenreService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {
    private final GenreDao genreDao;

    public GenreServiceImpl(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    @Override
    public Page<Genre> findAll() {
        return genreDao.findAll();
    }

    @Override
    public Page<Genre> findAll(Pageable pageable) {
        return genreDao.findAll(pageable);
    }

    @Override
    public Genre findById(Long id) {
        return genreDao.findById(id);
    }

    @Override
    public void save(Genre item) {
        genreDao.save(item);
    }

    @Override
    public void delete(Genre item) {
        genreDao.delete(item);
    }

    @Override
    public long count() {
        return genreDao.count();
    }
}
