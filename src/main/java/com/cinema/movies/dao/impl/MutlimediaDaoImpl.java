package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.MultimediaDao;
import com.cinema.movies.domain.Multimedia;
import org.springframework.stereotype.Repository;

@Repository
public class MutlimediaDaoImpl extends AbstractDao<Multimedia, Long> implements MultimediaDao {
    public MutlimediaDaoImpl() {
        super(Multimedia.class);
    }

    @Override
    public void save(Multimedia multimedia) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Multimedia multimedia) {
        throw new UnsupportedOperationException();
    }
}
