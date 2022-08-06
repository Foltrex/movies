package com.cinema.movies.service.impl;

import com.cinema.movies.dao.MultimediaDao;
import com.cinema.movies.domain.Multimedia;
import com.cinema.movies.service.MultimediaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MultimediaServiceImpl implements MultimediaService {
    private final MultimediaDao multimediaDao;

    public MultimediaServiceImpl(MultimediaDao multimediaDao) {
        this.multimediaDao = multimediaDao;
    }

    @Override
    public Page<Multimedia> findAll() {
        return multimediaDao.findAll();
    }

    @Override
    public Page<Multimedia> findAll(Pageable pageable) {
        return multimediaDao.findAll(pageable);
    }

    @Override
    public Multimedia findById(Long id) {
        return multimediaDao.findById(id);
    }

    @Override
    public void save(Multimedia item) {
        multimediaDao.save(item);
    }

    @Override
    public void delete(Multimedia item) {
        multimediaDao.delete(item);
    }

    @Override
    public long count() {
        return multimediaDao.count();
    }
}
