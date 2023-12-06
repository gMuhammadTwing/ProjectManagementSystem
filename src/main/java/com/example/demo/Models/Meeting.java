package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @Column(name = "group_id")
    private Integer groupId;

    private String agenda;

    @Column(name = "action_work")
    private String actionWork;

    @Column(name = "meeting_duration")
    private Integer meetingDuration;

    @Column(name = "date_and_time")
    private Date dateAndTime;

    private String location;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    // Constructors, getters, and setters

    public Meeting() {
    }

    public Meeting(Long id, Integer supervisorId, Integer groupId, String agenda, String actionWork, Integer meetingDuration, Date dateAndTime, String location, Date deletedAt, Integer isDeleted) {
        this.id = id;
        this.supervisorId = supervisorId;
        this.groupId = groupId;
        this.agenda = agenda;
        this.actionWork = actionWork;
        this.meetingDuration = meetingDuration;
        this.dateAndTime = dateAndTime;
        this.location = location;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getActionWork() {
        return actionWork;
    }

    public void setActionWork(String actionWork) {
        this.actionWork = actionWork;
    }

    public Integer getMeetingDuration() {
        return meetingDuration;
    }

    public void setMeetingDuration(Integer meetingDuration) {
        this.meetingDuration = meetingDuration;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        return "Meeting{" +
                "id=" + id +
                ", supervisorId=" + supervisorId +
                ", groupId=" + groupId +
                ", agenda='" + agenda + '\'' +
                // ... (other fields) +
                '}';
    }
}

