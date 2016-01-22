package com.necl.model.evaluate;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "tblMaster_Section")
public class Section {

    @Id
    @Column(name = "Section_Id")
    private String id;

    @Column(name = "Description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Division_Id")
    private Division division;

    @OneToMany(mappedBy = "section", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<SubSection> section = new ArrayList<SubSection>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<SubSection> getSection() {
        return section;
    }

    public void setSection(List<SubSection> section) {
        this.section = section;
    }

}
