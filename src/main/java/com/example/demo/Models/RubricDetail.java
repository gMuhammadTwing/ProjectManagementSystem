package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rubric_detail")
public class RubricDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;

    private Integer points;

    @Column(name = "rubric_id")
    private Integer rubricId;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public RubricDetail() {
    }

    public RubricDetail(Long id, String details, Integer points, Integer rubricId, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.details = details;
        this.points = points;
        this.rubricId = rubricId;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getRubricId() {
        return rubricId;
    }

    public void setRubricId(Integer rubricId) {
        this.rubricId = rubricId;
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
        return "RubricDetail{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", points=" + points +
                ", rubricId=" + rubricId +
                // ... (other fields) +
                '}';
    }
}

