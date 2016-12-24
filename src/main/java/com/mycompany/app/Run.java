package com.mycompany.app;

import org.hibernate.Session;

import java.util.Date;

/**
 * Created by AirShaos on 24/12/16.
 */
public class Run {
    public static void main(String[] args){
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();

//        user.setUserId(1);
        user.setUsername("James");
        user.setCreatedBy("Application");
        user.setCreatedDate(new Date());
        System.out.println("-------for fun 2");

        session.save(user);
        session.getTransaction().commit();
    }
}
