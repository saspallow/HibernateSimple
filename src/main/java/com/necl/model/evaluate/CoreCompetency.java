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
@Table(name = "MasterCoreCompetency")
public class CoreCompetency implements Serializable {

    @Id
    @Column(name = "Core_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "primaryKey.core",
            cascade = CascadeType.ALL)
    private Set<CoreForm> coreForms = new HashSet<CoreForm>();

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

    public Set<CoreForm> getCoreForms() {
        return coreForms;
    }

    public void setCoreForms(Set<CoreForm> coreForms) {
        this.coreForms = coreForms;
    }

    public void addCoreForms(CoreForm coreForm) {
        this.coreForms.add(coreForm);
    }

}
