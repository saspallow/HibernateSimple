package com.necl.model.evaluate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "FormEvaluation")
public class FormEvaluation implements Serializable {

    @Id
    @Column(name = "Form_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Division")
    private String division;

    @Column(name = "Section")
    private String section;

    @Column(name = "SubSection")
    private String subSection;

    @Column(name = "Position")
    private String position;

    @Column(name = "TotalScore")
    private int totalScore;

    @Column(name = "KPIScore")
    private int kpiScore;

    @Column(name = "CoreScore")
    private int coreScore;

    @Column(name = "ManageScore")
    private int manageScore;

    @Column(name = "FuncScore")
    private int funcScore;

    @Column(name = "Stauts", length = 10, columnDefinition = "varchar default Active")
    private String status = "Active";

    @OneToMany(mappedBy = "primaryKey.form",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private Set<CoreForm> coreForms = new HashSet<CoreForm>();

    @OneToMany(mappedBy = "primaryKeyFunc.formFunc",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private Set<FuncForm> funcForms = new HashSet<FuncForm>();

    @OneToMany(mappedBy = "primaryKeyManage.formManage",
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private Set<MangeForm> manageForms = new HashSet<MangeForm>();

    @OneToMany(mappedBy = "formEvaluation", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<EmployeeEvaluation> employeeEvaluations = new ArrayList<EmployeeEvaluation>();

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

    public int getCoreScore() {
        return coreScore;
    }

    public void setCoreScore(int coreScore) {
        this.coreScore = coreScore;
    }

    public int getManageScore() {
        return manageScore;
    }

    public void setManageScore(int manageScore) {
        this.manageScore = manageScore;
    }

    public int getFuncScore() {
        return funcScore;
    }

    public void setFuncScore(int funcScore) {
        this.funcScore = funcScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubSection() {
        return subSection;
    }

    public void setSubSection(String subSection) {
        this.subSection = subSection;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<EmployeeEvaluation> getEmployeeEvaluations() {
        return employeeEvaluations;
    }

    public void setEmployeeEvaluations(List<EmployeeEvaluation> employeeEvaluations) {
        this.employeeEvaluations = employeeEvaluations;
    }
}
