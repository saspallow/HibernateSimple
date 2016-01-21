package com.work.hibernate;

import com.necl.model.evaluate.CoreCompetency;
import com.necl.model.evaluate.CoreForm;
import com.necl.model.evaluate.EmployeeEvaluation;
import com.necl.model.evaluate.FormEvaluation;
import com.necl.model.evaluate.FuncForm;
import com.necl.model.evaluate.FunctionalCompetency;
import com.necl.model.evaluate.ManagerialCompetency;
import com.necl.model.evaluate.MangeForm;
import com.necl.model.evaluate.ScoreCore;
import com.necl.model.evaluate.ScoreFunc;
import com.necl.model.evaluate.ScoreManage;
import com.work.dao.CoreDao;
import com.work.dao.CoreFormDao;
import com.work.dao.FormDao;
import com.work.dao.FormEvaluationDao;
import com.work.dao.FunctionDao;
import com.work.dao.ManageDao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;

public class HibernateStandAloneDemo {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        HibernateStandAloneDemo application = new HibernateStandAloneDemo();

//        Stock stock = new Stock();
//    stock.setStockCode("7052");
//    stock.setStockName("PADINI");
// 
//    //assume category id is 7
//    Category category1 = (Category)session.get(Category.class, 7);
//    
//    StockCategory stockCategory = new StockCategory();
//    stockCategory.setStock(stock);
//    stockCategory.setCategory(category1);
//    stockCategory.setCreatedDate(new Date()); //extra column
//    stockCategory.setCreatedBy("system"); //extra column
//        
//    stock.getStockCategories().add(stockCategory);
//        
        FormEvaluation form = new FormEvaluation();
        form.setKpiScore(150);
        form.setTotalScore(900);
//  Core****
        CoreCompetency core1 = CoreDao.findByIdCore(1);
        CoreCompetency core2 = CoreDao.findByIdCore(2);
        CoreCompetency core3 = CoreDao.findByIdCore(3);
        CoreCompetency core4 = CoreDao.findByIdCore(4);
        CoreCompetency core5 = CoreDao.findByIdCore(5);

        CoreForm coreForm1 = new CoreForm();
        CoreForm coreForm2 = new CoreForm();
        CoreForm coreForm3 = new CoreForm();
        CoreForm coreForm4 = new CoreForm();
        CoreForm coreForm5 = new CoreForm();

        // C1
        coreForm1.setForm(form);
        coreForm1.setCore(core1);
        coreForm1.setWeight(6);
        coreForm1.setSortOrder(5);

        // C2
        coreForm2.setForm(form);
        coreForm2.setCore(core2);
        coreForm2.setWeight(7);
        coreForm2.setSortOrder(4);

        // C3
        coreForm3.setForm(form);
        coreForm3.setCore(core3);
        coreForm3.setWeight(8);
        coreForm3.setSortOrder(3);

        // C4
        coreForm4.setForm(form);
        coreForm4.setCore(core4);
        coreForm4.setWeight(9);
        coreForm4.setSortOrder(2);

        // C5
        coreForm5.setForm(form);
        coreForm5.setCore(core5);
        coreForm5.setWeight(10);
        coreForm5.setSortOrder(1);

//  Functional
        FunctionalCompetency func1 = FunctionDao.findById(1);
        FunctionalCompetency func2 = FunctionDao.findById(2);
        FunctionalCompetency func3 = FunctionDao.findById(3);

        FuncForm funcForm1 = new FuncForm();
        FuncForm funcForm2 = new FuncForm();
        FuncForm funcForm3 = new FuncForm();

        // F1
        funcForm1.setFormFunc(form);
        funcForm1.setFunc(func1);
        funcForm1.setWeight(1);
        funcForm1.setSortOrder(1);

        // F2
        funcForm2.setFormFunc(form);
        funcForm2.setFunc(func2);
        funcForm2.setWeight(2);
        funcForm2.setSortOrder(2);

        // F3
        funcForm3.setFormFunc(form);
        funcForm3.setFunc(func3);
        funcForm3.setWeight(3);
        funcForm3.setSortOrder(3);
//  Managerial

        ManagerialCompetency manage1 = ManageDao.findById(1);
        ManagerialCompetency manage2 = ManageDao.findById(2);
        ManagerialCompetency manage3 = ManageDao.findById(3);
        ManagerialCompetency manage4 = ManageDao.findById(4);
        ManagerialCompetency manage5 = ManageDao.findById(5);

        MangeForm manageForm1 = new MangeForm();
        MangeForm manageForm2 = new MangeForm();
        MangeForm manageForm3 = new MangeForm();
        MangeForm manageForm4 = new MangeForm();
        MangeForm manageForm5 = new MangeForm();

        manageForm1.setFormManage(form);
        manageForm1.setManage(manage1);
        manageForm1.setWeight(1);
        manageForm1.setSortOrder(1);

        manageForm2.setFormManage(form);
        manageForm2.setManage(manage2);
        manageForm2.setWeight(2);
        manageForm2.setSortOrder(2);

        manageForm3.setFormManage(form);
        manageForm3.setManage(manage3);
        manageForm3.setWeight(3);
        manageForm3.setSortOrder(3);

        manageForm4.setFormManage(form);
        manageForm4.setManage(manage4);
        manageForm4.setWeight(4);
        manageForm4.setSortOrder(4);

        manageForm5.setFormManage(form);
        manageForm5.setManage(manage5);
        manageForm5.setWeight(5);
        manageForm5.setSortOrder(5);

        // Add Core to Form
        form.addCoreForms(coreForm1);
        form.addCoreForms(coreForm2);
        form.addCoreForms(coreForm3);
        form.addCoreForms(coreForm4);
        form.addCoreForms(coreForm5);

        // Add Function to Form
        form.addFuncForms(funcForm1);
        form.addFuncForms(funcForm2);
        form.addFuncForms(funcForm3);

        // Add Managerial to Form
        form.addManageForms(manageForm1);
        form.addManageForms(manageForm2);
        form.addManageForms(manageForm3);
        form.addManageForms(manageForm4);
        form.addManageForms(manageForm5);

//        int id = FormDao.saveForm(form);
        FormEvaluation form1 = FormDao.findById(28);

        System.out.println("==== ID :" + form1.getId() + " =========================================");
        System.out.println("||                   Core Competency              ||");
        System.out.println("===================================================");
        int num = 0;
        for (CoreForm cf : form1.getCoreForms()) {
            num++;
            System.out.print("|| " + cf.getCore().getDescription());
            System.out.print(" Weight : [" + cf.getWeight() + "]\n");
        }

        System.out.println("===================================================");

        System.out.println("\n\n==== ID :" + form1.getId() + " =========================================");
        System.out.println("||             Functional Competency             ||");
        System.out.println("===================================================");
        for (FuncForm ff : form1.getFuncForms()) {
            System.out.print("|| " + ff.getFunc().getDescription());
            System.out.print(" Weight : [" + ff.getWeight() + "]\n");

        }
        System.out.println("===================================================");
        System.out.println("\n\n==== ID :" + form1.getId() + " =========================================");
        System.out.println("||             Managerial Competency             ||");
        System.out.println("===================================================");
        for (MangeForm mf : form1.getManageForms()) {
            System.out.print("|| " + mf.getManage().getDescription());
            System.out.print(" Weight : [" + mf.getWeight() + "]\n");

        }

        List<EmployeeEvaluation> eeeList = FormEvaluationDao.findByForm(form1.getId());

        System.out.println("===================================================");
        System.out.println("\n\n==== ID :" + form1.getId() + " =========================================");
        System.out.println("||             Employee Evaluation             ||");
        System.out.println("============================ TotalPerson : " + eeeList.size() + " ===");
        for (EmployeeEvaluation eee : eeeList) {
            System.out.println("\n===================================================");
            System.out.println("|| Username : " + eee.getUser().getFirstName());
            System.out.println(" ||  Score Core : " + eee.getScoreCore().size());
            System.out.println(" ||  Manage Core : " + eee.getScoreManage().size());
            System.out.println(" ||  Functional Core : " + eee.getScoreFunc().size());
            System.out.println("================== Core =================================");
            for (ScoreCore score : eee.getScoreCore()) {
                
                System.out.println("Description : " + score.getCoreCompetency().getDescription());
                System.out.println("First score : " + score.getFirstScore());
                System.out.println("Second score : " + score.getSecondScore());
                System.out.println("Thrid score : " + score.getThridScore()+"\n");
                score.setFirstScore(4);  
            }
            
            System.out.println("================== Manage =================================");
            for (ScoreManage score : eee.getScoreManage()) {
                
                System.out.println("Description : " + score.getManagerialCompetency().getDescription());
                System.out.println("First score : " + score.getFirstScore());
                System.out.println("Second score : " + score.getSecondScore());
                System.out.println("Thrid score : " + score.getThridScore()+"\n");
                score.setFirstScore(4);  
            }
            System.out.println("================== Functional =================================");
            for (ScoreFunc score : eee.getScoreFunc()) {
                
                System.out.println("Description : " + score.getFunctionalCompetency().getDescription());
                System.out.println("First score : " + score.getFirstScore());
                System.out.println("Second score : " + score.getSecondScore());
                System.out.println("Thrid score : " + score.getThridScore()+"\n");
                score.setFirstScore(4);  
            }
            FormEvaluationDao.updateFormEva(eee);
        }

    }

}
