package com.necl.model.evaluate;

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
@Table(name = "ScoreFunc")
public class ScoreFunc {

    @Id
    @Column(name = "ScoreFunc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Func_ID")
    private FunctionalCompetency functionalCompetency;

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

    public FunctionalCompetency getFunctionalCompetency() {
        return functionalCompetency;
    }

    public void setFunctionalCompetency(FunctionalCompetency functionalCompetency) {
        this.functionalCompetency = functionalCompetency;
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

}
