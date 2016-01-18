/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.CoreForm;
import com.necl.model.evaluate.FormEvaluation;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author C13.207
 */
public class CoreFormDao {
    
    public static int save(CoreForm coreForm) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        int id = (Integer) session.save(coreForm);
        session.getTransaction().commit();
        session.close();
        return id;
    }
    
    
    public static List<CoreForm> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<CoreForm> coreFormList = (List<CoreForm>) session.createQuery(
                "FROM CoreForm c").list();

        session.getTransaction().commit();
        session.close();
        return coreFormList;
    }
    
    public static CoreForm findById(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        CoreForm coreForm = (CoreForm) session.get(CoreForm.class, id);
        session.getTransaction().commit();
        session.close();
        return coreForm;
    }
    
    public static CoreForm findByForm(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<CoreForm> coreFormList = (List<CoreForm>) session.createQuery(
                "FROM CoreForm c where  CORE_FORM.FORM_ID = "+id+"").list();

        session.getTransaction().commit();
        session.close();
        return coreFormList.get(0);
    }
    
}
