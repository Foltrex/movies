package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.CountryDao;
import com.cinema.movies.domain.Country;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDaoImpl extends AbstractDao<Country, Long> implements CountryDao {
    public CountryDaoImpl() {
        super(Country.class);
    }
}
