package com.cinema.movies.service.impl;

import com.cinema.movies.dao.SeriesDao;
import com.cinema.movies.domain.Series;
import com.cinema.movies.service.SeriesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SeriesServiceImpl implements SeriesService {
    private final SeriesDao seriesDao;

    public SeriesServiceImpl(SeriesDao seriesDao) {
        this.seriesDao = seriesDao;
    }

    @Override
    public Page<Series> findAll() {
        return seriesDao.findAll();
    }

    @Override
    public Page<Series> findAll(Pageable pageable) {
        return seriesDao.findAll(pageable);
    }

    @Override
    public Series findById(Long id) {
        return seriesDao.findById(id);
    }

    @Override
    public void save(Series item) {
        seriesDao.save(item);
    }

    @Override
    public void delete(Series item) {
        seriesDao.delete(item);
    }

    @Override
    public long count() {
        return seriesDao.count();
    }
}
