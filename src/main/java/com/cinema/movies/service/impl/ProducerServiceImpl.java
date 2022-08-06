package com.cinema.movies.service.impl;

import com.cinema.movies.dao.ProducerDao;
import com.cinema.movies.domain.Producer;
import com.cinema.movies.service.ProducerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {
    private final ProducerDao producerDao;

    public ProducerServiceImpl(ProducerDao producerDao) {
        this.producerDao = producerDao;
    }

    @Override
    public Page<Producer> findAll() {
        return producerDao.findAll();
    }

    @Override
    public Page<Producer> findAll(Pageable pageable) {
        return producerDao.findAll(pageable);
    }

    @Override
    public Producer findById(Long id) {
        return producerDao.findById(id);
    }

    @Override
    public void save(Producer item) {
        producerDao.save(item);
    }

    @Override
    public void delete(Producer item) {
        producerDao.delete(item);
    }

    @Override
    public long count() {
        return producerDao.count();
    }
}
