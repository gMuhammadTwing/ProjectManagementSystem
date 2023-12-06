package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "idea")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "approved_status")
    private Integer approvedStatus;

    @Column(name = "status_updated_at")
    private Date statusUpdatedAt;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "committee_id")
    private Integer committeeId;

    public Idea(){

    }
    public Idea(Long id, String title, String description, String keywords, Integer approvedStatus, Date statusUpdatedAt, String remarks, Date deletedAt, Integer isDeleted, Integer groupId, Integer supervisorId, Integer committeeId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.keywords = keywords;
        this.approvedStatus = approvedStatus;
        this.statusUpdatedAt = statusUpdatedAt;
        this.remarks = remarks;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.groupId = groupId;
        this.supervisorId = supervisorId;
        this.committeeId = committeeId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getApprovedStatus() {
        return approvedStatus;
    }

    public void setApprovedStatus(Integer approvedStatus) {
        this.approvedStatus = approvedStatus;
    }

    public Date getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(Date statusUpdatedAt) {
        this.statusUpdatedAt = statusUpdatedAt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Integer getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(Integer committeeId) {
        this.committeeId = committeeId;
    }
}

