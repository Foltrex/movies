package com.cinema.movies.service.impl;

import com.cinema.movies.dao.CharacterDao;
import com.cinema.movies.domain.Character;
import com.cinema.movies.service.CharacterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {
    private final CharacterDao characterDao;

    public CharacterServiceImpl(CharacterDao characterDao) {
        this.characterDao = characterDao;
    }

    @Override
    public Page<Character> findAll() {
        return characterDao.findAll();
    }

    @Override
    public Page<Character> findAll(Pageable pageable) {
        return characterDao.findAll(pageable);
    }

    @Override
    public Character findById(Long id) {
        return characterDao.findById(id);
    }

    @Override
    public void save(Character item) {
        characterDao.save(item);
    }

    @Override
    public long count() {
        return characterDao.count();
    }

    @Override
    public void delete(Character item) {
        characterDao.delete(item);
    }
}
