package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "committee")
public class Committee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "supervisor_id")
    private Long supervisorId;

    @Column(name = "batch_id")
    private Long batchId;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public Committee() {
        // Default constructor
    }

    public Committee(Long supervisorId, Long batchId, java.sql.Timestamp deletedAt, Integer isDeleted) {
        this.supervisorId = supervisorId;
        this.batchId = batchId;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    // Getters and setters

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
}

