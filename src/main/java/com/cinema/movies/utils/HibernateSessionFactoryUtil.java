package com.cinema.movies.utils;

import com.cinema.movies.domain.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Map;

@Slf4j
public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(AbstractEntity.class);
                configuration.addAnnotatedClass(com.cinema.movies.domain.Character.class);
                configuration.addAnnotatedClass(Country.class);
                configuration.addAnnotatedClass(Genre.class);
                configuration.addAnnotatedClass(Multimedia.class);
                configuration.addAnnotatedClass(Movie.class);
                configuration.addAnnotatedClass(Producer.class);
                configuration.addAnnotatedClass(Series.class);

                StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
                Map<Object, Object> configurationProperties = configuration.getProperties();
                serviceRegistryBuilder.applySettings(configurationProperties);
                StandardServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (HibernateException e) {
                log.error(e.getMessage());
            }
        }
        return sessionFactory;
    }
}
