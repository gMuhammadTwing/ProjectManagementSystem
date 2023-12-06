package com.example.demo.Models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_description")
    private String roleDescription;

    @Column(name = "isActive")
    private Integer isActive;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    @OneToMany(mappedBy = "role")
    private List<RolePermission> rolePermissions;

    // Constructors, getters, and setters

    public Role() {
    }

    public Role(Long id, String roleName, String roleDescription, Integer isActive, Date deletedAt, Integer isDeleted, List<User> users, List<RolePermission> rolePermissions) {
        this.id = id;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
        this.isActive = isActive;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.users = users;
        this.rolePermissions = rolePermissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<RolePermission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", isActive=" + isActive +
                // ... (other fields) +
                '}';
    }
}

