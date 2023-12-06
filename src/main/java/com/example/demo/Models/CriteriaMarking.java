package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "criteria_marking")
public class CriteriaMarking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rubric_details_id")
    private Long rubricDetailsId;

    @Column(name = "points")
    private String points;

    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public CriteriaMarking() {
    }

    public CriteriaMarking(Long rubricDetailsId, String points, Long groupId, java.sql.Timestamp deletedAt, Integer isDeleted) {
        this.rubricDetailsId = rubricDetailsId;
        this.points = points;
        this.groupId = groupId;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRubricDetailsId() {
        return rubricDetailsId;
    }

    public void setRubricDetailsId(Long rubricDetailsId) {
        this.rubricDetailsId = rubricDetailsId;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public java.sql.Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(java.sql.Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
