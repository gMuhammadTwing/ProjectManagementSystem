package com.example.demo.Models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "meeting_id", nullable = false)
    private Meeting meeting;

    @Column(name = "status_is_present")
    private Integer statusIsPresent;

    @Column(name = "deleted_at")
    private java.sql.Timestamp deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    // Constructors
    public Attendance() {
    }

    public Attendance(Long id, Student student, Meeting meeting, Integer statusIsPresent, Timestamp deletedAt, Integer isDeleted) {
        this.id = id;
        this.student = student;
        this.meeting = meeting;
        this.statusIsPresent = statusIsPresent;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public Integer getStatusIsPresent() {
        return statusIsPresent;
    }

    public void setStatusIsPresent(Integer statusIsPresent) {
        this.statusIsPresent = statusIsPresent;
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
}
