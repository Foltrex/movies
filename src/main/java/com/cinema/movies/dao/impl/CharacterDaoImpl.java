package com.cinema.movies.dao.impl;

import com.cinema.movies.dao.AbstractDao;
import com.cinema.movies.dao.CharacterDao;
import com.cinema.movies.domain.Character;
import org.springframework.stereotype.Repository;

@Repository
public class CharacterDaoImpl extends AbstractDao<Character, Long> implements CharacterDao {

    protected CharacterDaoImpl() {
        super(Character.class);
    }
}
