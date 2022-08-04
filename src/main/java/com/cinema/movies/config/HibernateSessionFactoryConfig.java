package com.cinema.movies.config;

import com.cinema.movies.domain.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Map;

@Slf4j
public class HibernateSessionFactoryConfig {
    private static HibernateSessionFactoryConfig hibernateSessionFactory;

    private SessionFactory sessionFactory;


    public static HibernateSessionFactoryConfig getInstance() {
        if (hibernateSessionFactory == null) {
            hibernateSessionFactory = new HibernateSessionFactoryConfig();
        }
        return hibernateSessionFactory;
    }

    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(com.cinema.movies.domain.Character.class);
                configuration.addAnnotatedClass(Country.class);
                configuration.addAnnotatedClass(Genre.class);
                configuration.addAnnotatedClass(Movie.class);
                configuration.addAnnotatedClass(Multimedia.class);
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
