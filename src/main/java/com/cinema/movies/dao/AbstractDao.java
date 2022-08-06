package com.cinema.movies.dao;

import com.cinema.movies.domain.Character;
import com.cinema.movies.domain.Identifiable;
import com.cinema.movies.utils.HibernateSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class AbstractDao<T extends Identifiable<S>, S extends Serializable> implements Dao<T, S> {
    protected final SessionFactory sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();

    private final Class<T> clazz;

    protected AbstractDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public Page<T> findAll() {
        int allRecords = (int) this.count();
        Pageable pageable = PageRequest.of(0, allRecords);
        return findAll(pageable);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        TypedQuery<T> listQuery = session.createQuery("from " + clazz.getSimpleName(), clazz);
        listQuery.setFirstResult((int) pageable.getOffset());
        listQuery.setMaxResults(pageable.getPageSize());
        List<T> all = listQuery.getResultList();

        long count = this.count();

        transaction.commit();
        session.close();
        return new PageImpl<T>(all, pageable, count);
    }

    @Override
    public T findById(S id) {
        Session session = sessionFactory.openSession();
        return session.get(clazz, id);
    }

    @Override
    public void save(T item) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(item);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(T item) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(item);
        transaction.commit();
        session.close();
    }

    @Override
    public long count() {
        Session session = sessionFactory.openSession();
        Query amountQuery = session.createQuery("select count(*) from " + clazz.getSimpleName());
        Long count = (Long) amountQuery.uniqueResult();
        session.close();
        return count;
    }
}
