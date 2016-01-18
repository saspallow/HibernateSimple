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
@Table(name = "MasterManagerialCompetency")
public class ManagerialCompetency implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "primaryKeyManage.manage",
            cascade = CascadeType.ALL)
    private Set<MangeForm> manageForms = new HashSet<MangeForm>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<MangeForm> getManageForms() {
        return manageForms;
    }

    public void setManageForms(Set<MangeForm> manageForms) {
        this.manageForms = manageForms;
    }

    public void addManageForms(MangeForm mangeForm) {
        this.manageForms.add(mangeForm);
    }

}
