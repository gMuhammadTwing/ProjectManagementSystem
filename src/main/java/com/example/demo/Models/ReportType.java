package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "report_type")
public class ReportType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @OneToOne(mappedBy = "reportType")
    private AssignedWork assignedWork;

    // Constructors, getters, and setters

    public ReportType() {
    }

    public ReportType(Long id, String reportType, Date deletedAt, Integer isDeleted, AssignedWork assignedWork) {
        this.id = id;
        this.reportType = reportType;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.assignedWork = assignedWork;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
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

    public AssignedWork getAssignedWork() {
        return assignedWork;
    }

    public void setAssignedWork(AssignedWork assignedWork) {
        this.assignedWork = assignedWork;
    }

    @Override
    public String toString() {
        return "ReportType{" +
                "id=" + id +
                ", reportType='" + reportType + '\'' +
                // ... (other fields) +
                '}';
    }
}

