/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.FunctionalCompetency;
import com.necl.model.evaluate.HeaderAppraisal;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author C13.207
 */
public class HeaderDao {
    
    public static int save(HeaderAppraisal header) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(header);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    
    public static List<HeaderAppraisal> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<HeaderAppraisal> headerList = (List<HeaderAppraisal>) session.createQuery(
                "FROM FunctionalCompetency f").list();

        session.getTransaction().commit();
        session.close();
        return headerList;
    }
    
    public static HeaderAppraisal findById(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        HeaderAppraisal header = (HeaderAppraisal) session.get(HeaderAppraisal.class, id);
        session.getTransaction().commit();
        session.close();
        return header;
    }
}
