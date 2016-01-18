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
@Table(name = "MANAGE_FORM")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKeyManage.formManage",
            joinColumns = @JoinColumn(name = "FORM_ID")),
    @AssociationOverride(name = "primaryKeyManage.manage",
            joinColumns = @JoinColumn(name = "MANAGE_ID"))})
public class MangeForm implements Serializable {
    
    ManageFormId primaryKeyManage = new ManageFormId();
    
    private int weight;

    private int sortOrder;
    
    @EmbeddedId
    public ManageFormId getPrimaryKeyManage() {
        return primaryKeyManage;
    }

    public void setPrimaryKeyManage(ManageFormId primaryKeyManage) {
        this.primaryKeyManage = primaryKeyManage;
    }

    @Transient
    public FormEvaluation getFormManage() {
        return getPrimaryKeyManage().getFormManage();
    }

    public void setFormManage(FormEvaluation formEvaluation) {
        getPrimaryKeyManage().setFormManage(formEvaluation);
    }

    @Transient
    public ManagerialCompetency getManage() {
        return getPrimaryKeyManage().getManage();
    }

    public void setManage(ManagerialCompetency managerialCompetency) {
        getPrimaryKeyManage().setManage(managerialCompetency);
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
