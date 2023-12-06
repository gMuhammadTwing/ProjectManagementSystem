package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name", nullable = false)
    private String departmentName;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @Column(name = "deletedAt")
    private java.sql.Timestamp deletedAt;

    // Constructors, getters, and setters

    public Department() {
    }

    public Department(String departmentName, Integer isDeleted, java.sql.Timestamp deletedAt) {
        this.departmentName = departmentName;
        this.isDeleted = isDeleted;
        this.deletedAt = deletedAt;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public java.sql.Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(java.sql.Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }
}

