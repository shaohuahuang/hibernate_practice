package com.mycompany.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by AirShaos on 24/12/16.
 */
public class Run {
    private static final String PERSISTENCE_UNIT_NAME = "HelloWorldPU";
    private static EntityManagerFactory factory;
    
    public static void main(String[] args){
//        Session session = HibernateSessionManager.getSessionFactory().openSession();
//        session.beginTransaction();
//        User user = new User();
//
////        user.setUserId(1);
//        user.setUsername("James");
//        user.setCreatedBy("Application");
//        user.setCreatedDate(new Date());
//        System.out.println("-------for fun 2");
//
//        session.save(user);
//        session.getTransaction().commit();
      
      
//        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//
//        User user = new User();
//        user.setUsername("James1");
//        user.setCreatedBy("Application");
//        user.setCreatedDate(new Date());
//
//        em.persist(user);
//        em.getTransaction().commit();
//        em.close();
  
  
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        List<User> users = em.createQuery("select u from User u").getResultList();
      System.out.println(users.size());
      System.out.println(users.get(0).getUsername());

      users.get(0).setUsername("James shaos");

      em.getTransaction().commit();
      em.close();
//
      
    }
}
