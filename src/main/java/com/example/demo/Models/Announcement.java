package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "announcement")
public class Announcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "supervisor_id")
    private Long supervisorId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "batch_id")
    private Long batchId;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @Column(name = "date_and_time")
    private java.sql.Timestamp dateAndTime;

    // Constructors, getters, setters, and other methods

    // Constructors

    public Announcement() {
        // Default constructor
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Long supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
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

    public java.sql.Timestamp getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(java.sql.Timestamp dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
