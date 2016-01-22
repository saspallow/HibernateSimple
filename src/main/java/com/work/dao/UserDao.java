/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work.dao;

import com.necl.model.evaluate.ConfigAppraisal;
import com.necl.model.evaluate.EmployeeEvaluation;
import com.necl.model.evaluate.FormEvaluation;
import com.necl.model.evaluate.User;
import com.work.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author C13.207
 */
public class UserDao {

    public static List<User> generateInformation(ConfigAppraisal config) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("division.id", config.getDivision()));
        cr.add(Restrictions.eq("section.id", config.getSection()));
        cr.add(Restrictions.eq("subSection.id", config.getSubSection()));
        cr.add(Restrictions.eq("position.id", config.getPosition()));

        List results = cr.list();

        return results;
    }

    public static User findBySso(String sso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria crit = session.createCriteria(User.class);
        crit.add(Restrictions.eq("ssoId", sso));
        return (User) crit.uniqueResult();
    }

}
