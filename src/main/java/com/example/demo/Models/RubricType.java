package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rubric_type")
public class RubricType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rubric_type")
    private String rubricType;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public RubricType() {
    }

    public RubricType(Long id, String rubricType, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.rubricType = rubricType;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRubricType() {
        return rubricType;
    }

    public void setRubricType(String rubricType) {
        this.rubricType = rubricType;
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
        return "RubricType{" +
                "id=" + id +
                ", rubricType='" + rubricType + '\'' +
                // ... (other fields) +
                '}';
    }
}

