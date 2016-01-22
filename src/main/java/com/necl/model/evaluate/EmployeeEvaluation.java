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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "EmployeeEvaluation")
public class EmployeeEvaluation implements Serializable {

    @Id
    @Column(name = "EmpEva_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Emp_ID")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Header_ID")
    private HeaderAppraisal headerAppraisal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FORM_ID", nullable = false)
    private FormEvaluation formEvaluation;

    //onetomany
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "EmpEvaID")
    @Fetch(FetchMode.SUBSELECT)
    private Set<ScoreCore> scoreCore = new HashSet<ScoreCore>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "EmpEvaID")
    @Fetch(FetchMode.SUBSELECT)
    private Set<ScoreFunc> scoreFunc = new HashSet<ScoreFunc>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "EmpEvaID")
    @Fetch(FetchMode.SUBSELECT)
    private Set<ScoreManage> scoreManage = new HashSet<ScoreManage>();

    @Column(name = "FirstEvaluate_Id")
    private int firstEvaluateId;

    @Column(name = "FirstStatus")
    private boolean firstStatus;

    @Column(name = "SecondEvaluate_Id")
    private int secondEvaluateId;

    @Column(name = "SecondStatus")
    private boolean secondStatus;

    @Column(name = "ThridEvaluate_Id")
    private int thridEvaluateId;

    @Column(name = "ThridStatus")
    private boolean thridStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FormEvaluation getFormEvaluation() {
        return formEvaluation;
    }

    public void setFormEvaluation(FormEvaluation formEvaluation) {
        this.formEvaluation = formEvaluation;
    }

    public Set<ScoreCore> getScoreCore() {
        return scoreCore;
    }

    public void setScoreCore(Set<ScoreCore> scoreCore) {
        this.scoreCore = scoreCore;
    }

    public Set<ScoreFunc> getScoreFunc() {
        return scoreFunc;
    }

    public void setScoreFunc(Set<ScoreFunc> scoreFunc) {
        this.scoreFunc = scoreFunc;
    }

    public Set<ScoreManage> getScoreManage() {
        return scoreManage;
    }

    public void setScoreManage(Set<ScoreManage> scoreManage) {
        this.scoreManage = scoreManage;
    }

    public int getFirstEvaluateId() {
        return firstEvaluateId;
    }

    public void setFirstEvaluateId(int firstEvaluateId) {
        this.firstEvaluateId = firstEvaluateId;
    }

    public boolean isFirstStatus() {
        return firstStatus;
    }

    public void setFirstStatus(boolean firstStatus) {
        this.firstStatus = firstStatus;
    }

    public int getSecondEvaluateId() {
        return secondEvaluateId;
    }

    public void setSecondEvaluateId(int secondEvaluateId) {
        this.secondEvaluateId = secondEvaluateId;
    }

    public boolean isSecondStatus() {
        return secondStatus;
    }

    public void setSecondStatus(boolean secondStatus) {
        this.secondStatus = secondStatus;
    }

    public int getThridEvaluateId() {
        return thridEvaluateId;
    }

    public void setThridEvaluateId(int thridEvaluateId) {
        this.thridEvaluateId = thridEvaluateId;
    }

    public boolean isThridStatus() {
        return thridStatus;
    }

    public void setThridStatus(boolean thridStatus) {
        this.thridStatus = thridStatus;
    }

    public HeaderAppraisal getHeaderAppraisal() {
        return headerAppraisal;
    }

    public void setHeaderAppraisal(HeaderAppraisal headerAppraisal) {
        this.headerAppraisal = headerAppraisal;
    }

}
