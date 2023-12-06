package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "group_submitted_file")
public class GroupSubmittedFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "assigned_work_id")
    private Integer assignedWorkId;

    @Column(name = "submission_date_time")
    private Date submissionDateTime;

    @Column(name = "submission_status")
    private Integer submissionStatus;

    @Column(name = "obtained_marks")
    private Integer obtainedMarks;

    @Column(name = "comments")
    private String comments;

    @Column(name = "evaluation_at")
    private Date evaluationAt;

    @Column(name = "evaluation_status")
    private Integer evaluationStatus;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    // Default constructor
    public GroupSubmittedFile() {
    }

    // Parameterized constructor
    public GroupSubmittedFile(Integer groupId, Integer assignedWorkId, Date submissionDateTime,
                              Integer submissionStatus, Integer obtainedMarks, String comments,
                              Date evaluationAt, Integer evaluationStatus, Date deletedAt, Integer isDeleted) {
        this.groupId = groupId;
        this.assignedWorkId = assignedWorkId;
        this.submissionDateTime = submissionDateTime;
        this.submissionStatus = submissionStatus;
        this.obtainedMarks = obtainedMarks;
        this.comments = comments;
        this.evaluationAt = evaluationAt;
        this.evaluationStatus = evaluationStatus;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

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

    public Integer getAssignedWorkId() {
        return assignedWorkId;
    }

    public void setAssignedWorkId(Integer assignedWorkId) {
        this.assignedWorkId = assignedWorkId;
    }

    public Date getSubmissionDateTime() {
        return submissionDateTime;
    }

    public void setSubmissionDateTime(Date submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    public Integer getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(Integer submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public Integer getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(Integer obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getEvaluationAt() {
        return evaluationAt;
    }

    public void setEvaluationAt(Date evaluationAt) {
        this.evaluationAt = evaluationAt;
    }

    public Integer getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(Integer evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
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
