
import com.necl.model.evaluate.CoreCompetency;
import com.necl.model.evaluate.CoreForm;
import com.necl.model.evaluate.FormEvaluation;
import com.work.dao.CoreDao;
import com.work.dao.CoreFormDao;
import com.work.dao.FormDao;
import com.work.hibernate.HibernateStandAloneDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saspallow
 */
public class App {

    public static void main(String[] args) {
        HibernateStandAloneDemo application = new HibernateStandAloneDemo();
//
//        CoreCompetency coreCom1 = CoreDao.findByIdCore(1);
//        CoreCompetency coreCom2 = CoreDao.findByIdCore(2);
//        CoreCompetency coreCom3 = CoreDao.findByIdCore(3);
//        CoreCompetency coreCom4 = CoreDao.findByIdCore(4);
//        CoreCompetency coreCom5 = CoreDao.findByIdCore(5);
//
//        //1
//        CoreForm coreForm1 = new CoreForm();
//        coreForm1.setCoreCompetency(coreCom1);
//        coreForm1.setWeight(7);
//
//        //2
//        CoreForm coreForm2 = new CoreForm();
//        coreForm2.setCoreCompetency(coreCom2);
//        coreForm2.setWeight(8);
//
//        //3
//        CoreForm coreForm3 = new CoreForm();
//        coreForm3.setCoreCompetency(coreCom3);
//        coreForm3.setWeight(9);
//
//        //4
//        CoreForm coreForm4 = new CoreForm();
//        coreForm4.setCoreCompetency(coreCom4);
//        coreForm4.setWeight(10);
//
//        //5
//        CoreForm coreForm5 = new CoreForm();
//        coreForm5.setCoreCompetency(coreCom5);
//        coreForm5.setWeight(11);
//
//        // New Form
//        FormEvaluation newForm = new FormEvaluation();
//
//        newForm.setKpiScore(50);
//        newForm.setTotalScore(500);
//        newForm.getCoreForms().add(coreForm1);
//        newForm.getCoreForms().add(coreForm2);
//        newForm.getCoreForms().add(coreForm3);
//        newForm.getCoreForms().add(coreForm4);
//        newForm.getCoreForms().add(coreForm5);
//
//        // Before Save
//        int id = FormDao.saveForm(newForm);
//        FormEvaluation formBeforeSave = FormDao.findById(id);
//
//        for (CoreForm s : newForm.getCoreForms()) {
//            s.setFormEvaluation(formBeforeSave);
//
//            CoreFormDao.save(s);
//        }

    }
}
