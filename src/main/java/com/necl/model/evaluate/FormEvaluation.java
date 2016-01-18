package com.necl.model.evaluate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FormEvaluation")
public class FormEvaluation implements Serializable {

    @Id
    @Column(name = "Form_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TotalScore")
    private int totalScore;

    @Column(name = "KPIScore")
    private int kpiScore;

    @OneToMany(mappedBy = "primaryKey.form",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<CoreForm> coreForms = new HashSet<CoreForm>();
    
    @OneToMany(mappedBy = "primaryKeyFunc.formFunc",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<FuncForm> funcForms = new HashSet<FuncForm>();
    
    @OneToMany(mappedBy = "primaryKeyManage.formManage",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MangeForm> manageForms = new HashSet<MangeForm>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getKpiScore() {
        return kpiScore;
    }

    public void setKpiScore(int kpiScore) {
        this.kpiScore = kpiScore;
    }

    public Set<CoreForm> getCoreForms() {
        return coreForms;
    }

    public void setCoreForms(Set<CoreForm> coreForms) {
        this.coreForms = coreForms;
    }

    public void addCoreForms(CoreForm coreForm) {
        this.coreForms.add(coreForm);
    }

    public Set<FuncForm> getFuncForms() {
        return funcForms;
    }

    public void setFuncForms(Set<FuncForm> funcForms) {
        this.funcForms = funcForms;
    }
    
    public void addFuncForms(FuncForm funcForm) {
        this.funcForms.add(funcForm);
    }

    public Set<MangeForm> getManageForms() {
        return manageForms;
    }

    public void setManageForms(Set<MangeForm> manageForms) {
        this.manageForms = manageForms;
    }

    public void addManageForms(MangeForm MangeForm) {
        this.manageForms.add(MangeForm);
    }
    
    

}
