package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "group_supervisor")
public class GroupSupervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    // Default constructor
    public GroupSupervisor() {
    }

    // Parameterized constructor
    public GroupSupervisor(Integer groupId, Integer supervisorId, Date deletedAt, Integer isDeleted) {
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
}
