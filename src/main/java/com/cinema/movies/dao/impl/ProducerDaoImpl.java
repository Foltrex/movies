package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.ProducerDao;
import com.cinema.movies.domain.Producer;
import org.springframework.stereotype.Repository;

@Repository
public class ProducerDaoImpl extends AbstractDao<Producer, Long> implements ProducerDao {
    public ProducerDaoImpl() {
        super(Producer.class);
    }
}
