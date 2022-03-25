package com.sunglowsys.test;

import com.sunglowsys.domain.EmployeeEntity;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;

public class TestHibernateInsert {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EmployeeEntity emp = new EmployeeEntity();
        emp.setFirstName("Dinesh");
        emp.setLastName("Rajput");
        emp.setEmail("dk25@gamil.com");

        session.save(emp);
        session.getTransaction().commit();
        session.close();

    }
}
