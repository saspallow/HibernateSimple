package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class FuncFormId implements Serializable {

    private FormEvaluation formFunc;

    private FunctionalCompetency func;

    @ManyToOne(cascade = CascadeType.ALL)
    public FormEvaluation getFormFunc() {
        return formFunc;
    }

    public void setFormFunc(FormEvaluation formFunc) {
        this.formFunc = formFunc;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public FunctionalCompetency getFunc() {
        return func;
    }

    public void setFunc(FunctionalCompetency func) {
        this.func = func;
    }

}
