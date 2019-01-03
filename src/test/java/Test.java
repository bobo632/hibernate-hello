import com.sunyx.domain.Emp;
import com.sunyx.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by liuli on 2019/1/2.
 */
public class Test {
    private static Logger logger = Logger.getLogger(Test.class);
    @org.junit.Test
    public void test1() {
        logger.info("1111111111");
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Emp emp = new Emp();
        emp.setAge(18);
        emp.setBirthday(Date.valueOf("1988-01-01"));
        emp.setMarry(true);
        emp.setSalary(600.0);
        emp.setName("Tom");
        emp.setLogin(new Timestamp(System.currentTimeMillis()));

        try {
            session.save(emp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            try {
                session.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    @org.junit.Test
    public void test2() {
        logger.info("1111111111");
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Emp emp = new Emp();
        emp.setAge(18);
        emp.setBirthday(Date.valueOf("1988-01-01"));
        emp.setMarry(true);
        emp.setSalary(600.0);
        emp.setName("Tom");
        emp.setLogin(new Timestamp(System.currentTimeMillis()));

        try {
            session.save(emp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            try {
                session.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    @org.junit.Test
      public void test3(){
        Session session = HibernateUtil.getCurrentSession();
        logger.info("get之前");
        Transaction transaction = session.beginTransaction();
        Emp emp = null;
        try {
            emp = (Emp)session.get(Emp.class,1);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSession();
        }
        logger.info("get之后");
        System.out.println(emp);


    }
    @org.junit.Test
    public void test4(){
        Session session = HibernateUtil.getSession();
        logger.info("load之前");
        Emp emp = null;
        emp = (Emp)session.load(Emp.class,1);
        logger.info("load之后");
        System.out.println(emp);


    }
    @org.junit.Test
    public void test5(){
        Session session = HibernateUtil.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /*Emp emp = new Emp();
        emp.setId(1);
        emp.setName("1234");
        session.update(emp);*/
        Emp emp = (Emp)session.get(Emp.class,2);
        emp.setName("12345");
        transaction.commit();
    }
    @org.junit.Test
    public void test6(){
        "".contains(null);
    }

}
