package com.example.demo.Models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer pid;

    private String slug;

    private String description;

    private Integer active;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @OneToMany(mappedBy = "permission")
    private List<RolePermission> rolePermissions;

    // Constructors, getters, and setters

    public Permission() {
    }

    public Permission(Long id, String title, Integer pid, String slug, String description, Integer active, Date deletedAt, Integer isDeleted, List<RolePermission> rolePermissions) {
        this.id = id;
        this.title = title;
        this.pid = pid;
        this.slug = slug;
        this.description = description;
        this.active = active;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.rolePermissions = rolePermissions;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<RolePermission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pid=" + pid +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                // ... (other fields) +
                '}';
    }
}

