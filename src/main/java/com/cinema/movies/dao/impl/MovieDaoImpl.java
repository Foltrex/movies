package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.MovieDao;
import com.cinema.movies.domain.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie, Long> implements MovieDao {
    public MovieDaoImpl() {
        super(Movie.class);
    }
}
