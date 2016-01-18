/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.CoreCompetency;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Saspallow
 */
public class CoreDao {

    public static int saveCore(CoreCompetency coreCompetency) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(coreCompetency);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    
    public static List<CoreCompetency> getAllCore() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<CoreCompetency> coreList = (List<CoreCompetency>) session.createQuery(
                "FROM CoreCompetency c").list();

        session.getTransaction().commit();
        session.close();
        return coreList;
    }
    
    
    public static CoreCompetency findByIdCore(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CoreCompetency core = (CoreCompetency) session.get(CoreCompetency.class, id);
        session.getTransaction().commit();
        session.close();
        return core;
    }

}
