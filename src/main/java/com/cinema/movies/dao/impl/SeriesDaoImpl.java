package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.SeriesDao;
import com.cinema.movies.domain.Series;
import org.springframework.stereotype.Repository;

@Repository
public class SeriesDaoImpl extends AbstractDao<Series, Long> implements SeriesDao {
    public SeriesDaoImpl() {
        super(Series.class);
    }
}
