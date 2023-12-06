package com.example.demo.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "supervisor")
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId;

    private String office;

    private String specialization;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public Supervisor() {
    }

    public Supervisor(Long id, String userId, String office, String specialization, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.userId = userId;
        this.office = office;
        this.specialization = specialization;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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
        return "Supervisor{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", office='" + office + '\'' +
                ", specialization='" + specialization + '\'' +
                // ... (other fields) +
                '}';
    }
}
