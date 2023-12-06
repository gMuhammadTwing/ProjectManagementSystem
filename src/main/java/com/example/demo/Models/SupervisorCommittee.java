package com.example.demo.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "supervisor_committee")
public class SupervisorCommittee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "committee_id")
    private Integer committeeId;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public SupervisorCommittee() {
    }

    public SupervisorCommittee(Long id, Integer committeeId, Integer supervisorId, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.committeeId = committeeId;
        this.supervisorId = supervisorId;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(Integer committeeId) {
        this.committeeId = committeeId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
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
        return "SupervisorCommittee{" +
                "id=" + id +
                ", committeeId=" + committeeId +
                ", supervisorId=" + supervisorId +
                // ... (other fields) +
                '}';
    }
}

