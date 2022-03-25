package com.sunglowsys.test;

import com.sunglowsys.domain.EmployeeEntity;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class TestDeleteRecord {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EmployeeEntity emp = new EmployeeEntity();
        Query q = session.createQuery("delete from EmployeeEntity  where id=:x");
        q.setParameter("x",1);
        int n = q.executeUpdate();
        System.out.println("delete");
        System.out.println(n);
        session.getTransaction().commit();
        session.close();
    }
}
