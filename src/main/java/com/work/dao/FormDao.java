/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.EmployeeEvaluation;
import com.necl.model.evaluate.FormEvaluation;
import com.necl.model.evaluate.ManagerialCompetency;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Saspallow
 */
public class FormDao {

    public static int saveForm(FormEvaluation formEvaluation) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(formEvaluation);
        session.getTransaction().commit();
        session.close();

        return id;
    }

    public static boolean update(FormEvaluation formEvaluation) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(formEvaluation);
        session.getTransaction().commit();
        session.close();
        return true;
    }
    
    public static boolean updateEmpEva(EmployeeEvaluation employeeEvaluation) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(employeeEvaluation);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public static List<FormEvaluation> getAllManagerail() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<FormEvaluation> manageList = (List<FormEvaluation>) session.createQuery(
                "FROM FormEvaluation f").list();

        session.getTransaction().commit();
        session.close();
        return manageList;
    }

    public static FormEvaluation findById(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria crit = session.createCriteria(FormEvaluation.class);
        crit.add(Restrictions.eq("id", id));
        crit.createAlias("coreForms", "c");
        crit.addOrder(Order.asc("c.sortOrder"));
        return (FormEvaluation) crit.uniqueResult();
    }

}
