package com.example.demo.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PLO")
public class PLO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public PLO() {
    }

    public PLO(Long id, String title, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.title = title;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "PLO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                // ... (other fields) +
                '}';
    }
}

