package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_title")
    private String projectTitle;

    @Column(name = "committee_id")
    private Integer committeeId;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "group_status")
    private Integer groupStatus;

    @Column(name = "project_status")
    private String projectStatus;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public Group() {
    }

    public Group(String projectTitle, Integer committeeId, Integer supervisorId, Integer groupStatus,
                 String projectStatus, java.sql.Timestamp deletedAt, Integer isDeleted) {
        this.projectTitle = projectTitle;
        this.committeeId = committeeId;
        this.supervisorId = supervisorId;
        this.groupStatus = groupStatus;
        this.projectStatus = projectStatus;
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

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
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

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
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

    // Other methods if needed
}
