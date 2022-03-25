package com.sunglowsys.test;

import com.sunglowsys.domain.EmployeeEntity;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class TestGetAllData {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.getTransaction();
       // EmployeeEntity emp = new EmployeeEntity();
        Query q = session.createQuery("from EmployeeEntity");
        List<EmployeeEntity>list=q.list();
        for (EmployeeEntity emp :list){
            System.out.println(emp.getId()+"  "+emp.getFirstName()+" "+emp.getLastName()+"  "+emp.getEmail()+" ");

        }        session.close();

    }
}
