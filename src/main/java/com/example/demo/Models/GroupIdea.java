package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "group_idea")
public class GroupIdea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idea_id")
    private Integer ideaId;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    // Constructors
    public GroupIdea() {
    }

    public GroupIdea(Integer ideaId, Integer groupId, Integer supervisorId, java.sql.Timestamp deletedAt, Integer isDeleted) {
        this.ideaId = ideaId;
        this.groupId = groupId;
        this.supervisorId = supervisorId;
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

    public Integer getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(Integer ideaId) {
        this.ideaId = ideaId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
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

