/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ManageFormId implements Serializable {

    private FormEvaluation formManage;

    private ManagerialCompetency manage;

    @ManyToOne(cascade = CascadeType.ALL)
    public FormEvaluation getFormManage() {
        return formManage;
    }

    public void setFormManage(FormEvaluation formManage) {
        this.formManage = formManage;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public ManagerialCompetency getManage() {
        return manage;
    }

    public void setManage(ManagerialCompetency manage) {
        this.manage = manage;
    }

}
