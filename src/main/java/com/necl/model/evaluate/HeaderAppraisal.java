package com.necl.model.evaluate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

 @Entity
@Table(name = "HeaderAppraisal")
public class HeaderAppraisal implements Serializable {

    @Id
    @Column(name = "Header_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Year")
    private int year;

    @Column(name = "Half")
    private String half;

    @Column(name = "Description")
    private String description;

    @Column(name = "StartAppraisal")
    private Date startAppraisal;

    @Column(name = "EndAppraisal")
    private Date endAppraisal;

    @Column(name = "Status")
    private String status;

    @OneToMany(mappedBy = "formEvaluation", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<EmployeeEvaluation> employeeEvaluations = new ArrayList<EmployeeEvaluation>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinColumn(name = "Header_Id")
    private List<ConfigAppraisal> configAppraisal = new ArrayList<ConfigAppraisal>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHalf() {
        return half;
    }

    public void setHalf(String half) {
        this.half = half;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartAppraisal() {
        return startAppraisal;
    }

    public void setStartAppraisal(Date startAppraisal) {
        this.startAppraisal = startAppraisal;
    }

    public Date getEndAppraisal() {
        return endAppraisal;
    }

    public void setEndAppraisal(Date endAppraisal) {
        this.endAppraisal = endAppraisal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<EmployeeEvaluation> getEmployeeEvaluations() {
        return employeeEvaluations;
    }

    public void setEmployeeEvaluations(List<EmployeeEvaluation> employeeEvaluations) {
        this.employeeEvaluations = employeeEvaluations;
    }

    public List<ConfigAppraisal> getConfigAppraisal() {
        return configAppraisal;
    }

    public void setConfigAppraisal(List<ConfigAppraisal> configAppraisal) {
        this.configAppraisal = configAppraisal;
    }

}
