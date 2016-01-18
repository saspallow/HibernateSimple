/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.FunctionalCompetency;
import com.necl.model.evaluate.ManagerialCompetency;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Saspallow
 */
public class ManageDao {
    
    public static int saveManage(ManagerialCompetency managerialCompetency) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(managerialCompetency);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    
    
    public static List<ManagerialCompetency> getAllManagerail() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<ManagerialCompetency> manageList = (List<ManagerialCompetency>) session.createQuery(
                "FROM ManagerialCompetency m").list();

        session.getTransaction().commit();
        session.close();
        return manageList;
    }
    
     public static ManagerialCompetency findById(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ManagerialCompetency manage = (ManagerialCompetency) session.get(ManagerialCompetency.class, id);
        session.getTransaction().commit();
        session.close();
        return manage;
    }
    
}
