package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScoreCore")
public class ScoreCore implements Serializable {

    @Id
    @Column(name = "ScoreCore_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Core_ID")
    private CoreCompetency CoreCompetency;

    @Column(name = "FirstScore")
    private int firstScore;

    @Column(name = "SecondScore")
    private int secondScore;

    @Column(name = "ThridScore")
    private int thridScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public int getThridScore() {
        return thridScore;
    }

    public void setThridScore(int thridScore) {
        this.thridScore = thridScore;
    }

    public CoreCompetency getCoreCompetency() {
        return CoreCompetency;
    }

    public void setCoreCompetency(CoreCompetency CoreCompetency) {
        this.CoreCompetency = CoreCompetency;
    }

}
