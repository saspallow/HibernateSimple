/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.CoreCompetency;
import com.necl.model.evaluate.EmployeeEvaluation;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author C13.207
 */
public class EmployeeEvaluationDao {

    public static int saveFormEva(EmployeeEvaluation employeeEvaluation) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(employeeEvaluation);
        session.getTransaction().commit();
        session.close();
        return id;
    }

    public static List<EmployeeEvaluation> getAllFormEva() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<EmployeeEvaluation> employeeEvaluationList = (List<EmployeeEvaluation>) session.createQuery(
                "FROM EmployeeEvaluation e").list();

        session.getTransaction().commit();
        session.close();
        return employeeEvaluationList;
    }

    public static EmployeeEvaluation findByIdFormEva(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        EmployeeEvaluation employeeEvaluation = (EmployeeEvaluation) session.get(EmployeeEvaluation.class, id);
        session.getTransaction().commit();
        session.close();
        return employeeEvaluation;
    }

//    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public static boolean updateFormEva(EmployeeEvaluation employeeEvaluation) {

        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(employeeEvaluation);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public static List<EmployeeEvaluation> findByForm(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria cr = session.createCriteria(EmployeeEvaluation.class);
        cr.add(Restrictions.eq("formEvaluation.id", id));
        List results = cr.list();
        session.getTransaction().commit();
        session.close();
        return results;
    }

}
