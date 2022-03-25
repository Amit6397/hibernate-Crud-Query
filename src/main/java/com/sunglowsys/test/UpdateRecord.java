package com.sunglowsys.test;

import com.sunglowsys.domain.EmployeeEntity;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateRecord {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EmployeeEntity emp = new EmployeeEntity();
        Query q1 = session.createQuery("update EmployeeEntity set firstName=:x where id =:y");
        q1.setParameter("x","sumit");
        q1.setParameter("y",1);
        int n = q1.executeUpdate();
        session.getTransaction().commit();
        session.close();
        /*SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        EmployeeEntity emp = new EmployeeEntity();
        Query q1 = session.createQuery("update EmployeeEntity set email=:x where id =:y");
        q1.setParameter("x","sk4353@gmail.com");
        q1.setParameter("y",1);
        int n = q1.executeUpdate();

        System.out.println("update");
        System.out.println(n);
        tx.commit();
        session.close();
        factory.close();*/
    }


}
