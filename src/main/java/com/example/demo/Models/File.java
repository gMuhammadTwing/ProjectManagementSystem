package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "file")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_submitted_files_id")
    private Integer groupSubmittedFilesId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    // Constructors
    public File() {
    }

    public File(Integer groupSubmittedFilesId, String fileName, java.sql.Timestamp deletedAt, Integer isDeleted) {
        this.groupSubmittedFilesId = groupSubmittedFilesId;
        this.fileName = fileName;
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

    public Integer getGroupSubmittedFilesId() {
        return groupSubmittedFilesId;
    }

    public void setGroupSubmittedFilesId(Integer groupSubmittedFilesId) {
        this.groupSubmittedFilesId = groupSubmittedFilesId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

