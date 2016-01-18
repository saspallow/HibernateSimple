/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CORE_FORM")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.form",
            joinColumns = @JoinColumn(name = "FORM_ID")),
    @AssociationOverride(name = "primaryKey.core",
            joinColumns = @JoinColumn(name = "CORE_ID"))})
public class CoreForm implements Serializable {

    CoreFormId primaryKey = new CoreFormId();

    private int weight;

    private int sortOrder;

    @EmbeddedId
    public CoreFormId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(CoreFormId primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Transient
    public FormEvaluation getForm() {
        return getPrimaryKey().getForm();
    }

    public void setForm(FormEvaluation formEvaluation) {
        getPrimaryKey().setForm(formEvaluation);
    }

    @Transient
    public CoreCompetency getCore() {
        return getPrimaryKey().getCore();
    }

    public void setCore(CoreCompetency coreCompetency) {
        getPrimaryKey().setCore(coreCompetency);
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
