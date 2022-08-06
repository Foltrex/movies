package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.GenreDao;
import com.cinema.movies.domain.Genre;
import org.springframework.stereotype.Repository;

@Repository
public class GenreDaoImpl extends AbstractDao<Genre, Long> implements GenreDao {
    public GenreDaoImpl() {
        super(Genre.class);
    }
}
