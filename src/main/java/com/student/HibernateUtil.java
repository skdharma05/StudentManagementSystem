package com.student;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try{
             sessionFactory = new Configuration()
                 .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("SessionFactory Creation failed:" +ex);
            throw new
                    ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getFactory() {
        return sessionFactory;
    }
}
