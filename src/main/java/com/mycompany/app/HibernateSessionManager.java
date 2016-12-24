package com.mycompany.app;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by AirShaos on 24/12/16.
 */
public class HibernateSessionManager {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
//            return new Configuration().configure().buildSessionFactory();
            return new AnnotationConfiguration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        }catch (HibernateException ex){
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
