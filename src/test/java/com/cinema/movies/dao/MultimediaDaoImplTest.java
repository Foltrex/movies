package com.cinema.movies.dao;

import com.cinema.movies.dao.impl.MutlimediaDaoImpl;
import com.cinema.movies.utils.HibernateSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
public class MultimediaDaoImplTest {

    private final MultimediaDao multimediaDao = new MutlimediaDaoImpl();

    @Test
    public void test() {
        Assert.assertNotNull(HibernateSessionFactoryUtil.getSessionFactory());
    }
}
