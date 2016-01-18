package com.necl.model.evaluate;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MasterFunctionalCompetency")
public class FunctionalCompetency implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "primaryKeyFunc.func",
            cascade = CascadeType.ALL)
    private Set<FuncForm> funcForms = new HashSet<FuncForm>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Set<FuncForm> getFuncForms() {
        return funcForms;
    }

    public void setFuncForms(Set<FuncForm> funcForms) {
        this.funcForms = funcForms;
    }

    public void addFuncForms(FuncForm funcForm) {
        this.funcForms.add(funcForm);
    }

}
