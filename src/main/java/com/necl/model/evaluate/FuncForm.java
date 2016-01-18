/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "FUNC_FORM")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKeyFunc.formFunc",
            joinColumns = @JoinColumn(name = "FORM_ID")),
    @AssociationOverride(name = "primaryKeyFunc.func",
            joinColumns = @JoinColumn(name = "FUNC_ID"))})
public class FuncForm implements Serializable {

    FuncFormId primaryKeyFunc = new FuncFormId();

    private int weight;

    private int sortOrder;

    @EmbeddedId
    public FuncFormId getPrimaryKeyFunc() {
        return primaryKeyFunc;
    }

    public void setPrimaryKeyFunc(FuncFormId primaryKeyFunc) {
        this.primaryKeyFunc = primaryKeyFunc;
    }

    @Transient
    public FormEvaluation getFormFunc() {
        return getPrimaryKeyFunc().getFormFunc();
    }

    public void setFormFunc(FormEvaluation formEvaluation) {
        getPrimaryKeyFunc().setFormFunc(formEvaluation);
    }

    @Transient
    public FunctionalCompetency getFunc() {
        return getPrimaryKeyFunc().getFunc();
    }

    public void setFunc(FunctionalCompetency functionalCompetency) {
        getPrimaryKeyFunc().setFunc(functionalCompetency);
    }

    @Column(name = "WEIGHT")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Column(name = "SortOrder")
    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
