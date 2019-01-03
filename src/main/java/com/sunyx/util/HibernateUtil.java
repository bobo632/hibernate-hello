package com.sunyx.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by liuli on 2019/1/2.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static ThreadLocal<Session> session;
    static{
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
            throw new HibernateException("初始化Hibernate失败");
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }


    public static void closeSession() throws HibernateException{
        sessionFactory.getCurrentSession().close();

    }
}
