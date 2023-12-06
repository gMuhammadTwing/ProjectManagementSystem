package com.example.demo.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "rubric")
public class Rubric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String criteria;

    @Column(name = "rubric_type_id")
    private Integer rubricTypeId;

    @Column(name = "PLO_id")
    private Integer ploId;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public Rubric() {
    }

    public Rubric(Long id, String criteria, Integer rubricTypeId, Integer ploId, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.criteria = criteria;
        this.rubricTypeId = rubricTypeId;
        this.ploId = ploId;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public Integer getRubricTypeId() {
        return rubricTypeId;
    }

    public void setRubricTypeId(Integer rubricTypeId) {
        this.rubricTypeId = rubricTypeId;
    }

    public Integer getPloId() {
        return ploId;
    }

    public void setPloId(Integer ploId) {
        this.ploId = ploId;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Rubric{" +
                "id=" + id +
                ", criteria='" + criteria + '\'' +
                ", rubricTypeId=" + rubricTypeId +
                ", ploId=" + ploId +
                // ... (other fields) +
                '}';
    }
}

