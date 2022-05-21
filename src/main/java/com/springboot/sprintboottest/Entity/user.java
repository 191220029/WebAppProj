package com.springboot.sprintboottest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "user")
public class user {
    @Override
    public String toString() {
        return "user{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserGender=" + UserGender +
                ", UserPrivilegeLevel=" + UserPrivilegeLevel +
                ", UserAssignment='" + UserAssignment + '\'' +
                ", UserLevel=" + UserLevel +
                ", UserExp=" + UserExp +
                ", UserEmail='" + UserEmail + '\'' +
                ", UserIconPath='" + UserIconPath + '\'' +
                ", UserRegistoryTime=" + UserRegistoryTime +
                ", UserLastLoginTime=" + UserLastLoginTime +
                ", UserStatus=" + UserStatus +
                '}';
    }

    @Id
    @Column(name = "UserId")
    private Integer UserId;
    @Column(name = "UserName")
    private String UserName;
    @Column(name = "UserPassword")
    private String UserPassword;
    @Column(name = "UserGender")
    private Integer UserGender;
    @Column(name = "UserPrivilegeLevel")
    private Integer UserPrivilegeLevel;
    @Column(name = "UserAssignment")
    private String UserAssignment;
    @Column(name = "UserLevel")
    private Integer UserLevel;
    @Column(name = "UserExp")
    private Integer UserExp;
    @Column(name = "UserEmail")
    private String UserEmail;
    @Column(name = "UserIconPath")
    private String UserIconPath;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Column(name = "UserRegistoryTime")
    private Date UserRegistoryTime;
    @Column(name = "UserLastLoginTime")
    private Date UserLastLoginTime;
    @Column(name = "UserStatus")
    private Integer UserStatus;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public Integer getUserGender() {
        return UserGender;
    }

    public void setUserGender(Integer userGender) {
        UserGender = userGender;
    }

    public Integer getUserPrivilegeLevel() {
        return UserPrivilegeLevel;
    }

    public void setUserPrivilegeLevel(Integer userPrivilegeLevel) {
        UserPrivilegeLevel = userPrivilegeLevel;
    }

    public String getUserAssignment() {
        return UserAssignment;
    }

    public void setUserAssignment(String userAssignment) {
        UserAssignment = userAssignment;
    }

    public Integer getUserLevel() {
        return UserLevel;
    }

    public void setUserLevel(Integer userLevel) {
        UserLevel = userLevel;
    }

    public Integer getUserExp() {
        return UserExp;
    }

    public void setUserExp(Integer userExp) {
        UserExp = userExp;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserIconPath() {
        return UserIconPath;
    }

    public void setUserIconPath(String userIconPath) {
        UserIconPath = userIconPath;
    }

    public Date getUserRegistoryTime() {
        return UserRegistoryTime;
    }

    public void setUserRegistoryTime(Date userRegistoryTime) {
        UserRegistoryTime = userRegistoryTime;
    }

    public Date getUserLastLoginTime() {
        return UserLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        UserLastLoginTime = userLastLoginTime;
    }

    public Integer getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(Integer userStatus) {
        UserStatus = userStatus;
    }

}
