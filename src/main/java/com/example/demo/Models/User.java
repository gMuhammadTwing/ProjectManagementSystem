package com.example.demo.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private String name;

    private String email;

    private String password;

    @Column(name = "imgUrl")
    private String imgUrl;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "isActive")
    private Integer isActive;

    @Column(name = "is_verified")
    private Integer isVerified;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "department_id")
    private Integer departmentId;

    // Constructors, getters, and setters

    public User() {
    }

    public User(Long id, String userName, String name, String email, String password, String imgUrl, String phoneNumber, Integer isActive, Integer isVerified, Date deletedAt, Integer isDeleted, Date lastLogin, Integer roleId, Integer departmentId) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.imgUrl = imgUrl;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.isVerified = isVerified;
        this.deletedAt = deletedAt;
        this.isDeleted = isDeleted;
        this.lastLogin = lastLogin;
        this.roleId = roleId;
        this.departmentId = departmentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
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

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                // ... (other fields) +
                '}';
    }
}

