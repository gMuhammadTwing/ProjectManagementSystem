package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting_assigned_work")
public class MeetingAssignedWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "meeting_id")
    private Integer meetingId;

    @Column(name = "action_work")
    private String actionWork;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public MeetingAssignedWork() {
    }

    public MeetingAssignedWork(Long id, Integer studentId, Integer meetingId, String actionWork, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.studentId = studentId;
        this.meetingId = meetingId;
        this.actionWork = actionWork;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getActionWork() {
        return actionWork;
    }

    public void setActionWork(String actionWork) {
        this.actionWork = actionWork;
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
        return "MeetingAssignedWork{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", meetingId=" + meetingId +
                ", actionWork='" + actionWork + '\'' +
                // ... (other fields) +
                '}';
    }
}
