package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notification_queue")
public class NotificationQueue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "status_viewed")
    private Integer statusViewed;

    @Column(name = "viewed_at")
    private Date viewedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @ManyToOne
    @JoinColumn(name = "announcement_id")
    private Announcement announcement;

    // Constructors, getters, and setters

    public NotificationQueue() {
    }

    public NotificationQueue(Long id, Integer userId, Integer statusViewed, Date viewedAt, Date deletedAt, Integer isDeleted, Announcement announcement) {
        this.id = id;
        this.userId = userId;
        this.statusViewed = statusViewed;
        this.viewedAt = viewedAt;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.announcement = announcement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatusViewed() {
        return statusViewed;
    }

    public void setStatusViewed(Integer statusViewed) {
        this.statusViewed = statusViewed;
    }

    public Date getViewedAt() {
        return viewedAt;
    }

    public void setViewedAt(Date viewedAt) {
        this.viewedAt = viewedAt;
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

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        return "NotificationQueue{" +
                "id=" + id +
                ", userId=" + userId +
                ", statusViewed=" + statusViewed +
                ", viewedAt=" + viewedAt +
                // ... (other fields) +
                '}';
    }
}

