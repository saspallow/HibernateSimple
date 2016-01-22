package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ConfigAppraisal")
public class ConfigAppraisal implements Serializable {

    @Id
    @Column(name = "ConfigAppraisal_Id")
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

    @Column(name = "FirstAppraisal")
    private String firstAppraisal;

    @Column(name = "SecondAppraisal")
    private String secondAppraisal;

    @Column(name = "ThridAppraisal")
    private String thridAppraisal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFirstAppraisal() {
        return firstAppraisal;
    }

    public void setFirstAppraisal(String firstAppraisal) {
        this.firstAppraisal = firstAppraisal;
    }

    public String getSecondAppraisal() {
        return secondAppraisal;
    }

    public void setSecondAppraisal(String secondAppraisal) {
        this.secondAppraisal = secondAppraisal;
    }

    public String getThridAppraisal() {
        return thridAppraisal;
    }

    public void setThridAppraisal(String thridAppraisal) {
        this.thridAppraisal = thridAppraisal;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
