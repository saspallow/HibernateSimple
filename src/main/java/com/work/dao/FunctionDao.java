/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.CoreCompetency;
import com.necl.model.evaluate.FunctionalCompetency;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Saspallow
 */
public class FunctionDao {

    public static int saveFunctional(FunctionalCompetency functionalCompetency) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(functionalCompetency);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    
    public static List<FunctionalCompetency> getAllFunctional() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<FunctionalCompetency> functionList = (List<FunctionalCompetency>) session.createQuery(
                "FROM FunctionalCompetency f").list();

        session.getTransaction().commit();
        session.close();
        return functionList;
    }
    
    public static FunctionalCompetency findById(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        FunctionalCompetency func = (FunctionalCompetency) session.get(FunctionalCompetency.class, id);
        session.getTransaction().commit();
        session.close();
        return func;
    }
}
