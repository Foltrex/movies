package com.cinema.movies.service.impl;

import com.cinema.movies.dao.CountryDao;
import com.cinema.movies.domain.Country;
import com.cinema.movies.service.CountryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryDao countryDao;

    public CountryServiceImpl(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @Override
    public Page<Country> findAll() {
        return countryDao.findAll();
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return countryDao.findAll(pageable);
    }

    @Override
    public Country findById(Long id) {
        return countryDao.findById(id);
    }

    @Override
    public void save(Country item) {
        countryDao.save(item);
    }

    @Override
    public void delete(Country item) {
        countryDao.delete(item);
    }

    @Override
    public long count() {
        return countryDao.count();
    }
}
