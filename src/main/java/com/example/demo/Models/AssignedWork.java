package com.example.demo.Models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "assigned_work")
public class AssignedWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "total_points")
    private String totalPoints;

    @ManyToOne
    @JoinColumn(name = "report_type_id")
    private ReportType reportType;

    @Column(name = "deadLine")
    private java.sql.Timestamp deadLine;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @OneToOne(mappedBy = "assignedWork")
    private GroupSubmittedFile groupSubmittedFile;

    // Constructors, getters, and setters

    // Constructors
    public AssignedWork() {
    }

    public AssignedWork(Long id, String title, String description, String totalPoints, ReportType reportType, Timestamp deadLine, Batch batch, Timestamp deletedAt, Integer isDeleted, GroupSubmittedFile groupSubmittedFile) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.totalPoints = totalPoints;
        this.reportType = reportType;
        this.deadLine = deadLine;
        this.batch = batch;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.groupSubmittedFile = groupSubmittedFile;
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

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public Timestamp getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Timestamp deadLine) {
        this.deadLine = deadLine;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public GroupSubmittedFile getGroupSubmittedFile() {
        return groupSubmittedFile;
    }

    public void setGroupSubmittedFile(GroupSubmittedFile groupSubmittedFile) {
        this.groupSubmittedFile = groupSubmittedFile;
    }
}

