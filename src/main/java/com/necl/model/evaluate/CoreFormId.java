package com.necl.model.evaluate;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CoreFormId implements Serializable {

    private FormEvaluation form;

    private CoreCompetency core;

    @ManyToOne(cascade = CascadeType.ALL)
    public FormEvaluation getForm() {
        return form;
    }

    public void setForm(FormEvaluation form) {
        this.form = form;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public CoreCompetency getCore() {
        return core;
    }

    public void setCore(CoreCompetency core) {
        this.core = core;
    }

}
