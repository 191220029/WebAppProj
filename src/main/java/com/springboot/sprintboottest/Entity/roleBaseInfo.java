package com.springboot.sprintboottest.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_base_info")
public class roleBaseInfo {
    @Id
    @Column(name = "RoleCardId")
    private Integer RoleCardId;

    @Column(name = "RoleCardPlayerId")
    private Integer RoleCardPlayerId;
    @Column(name = "RoleName")
    private String RoleName;
    @Column(name = "UserName")
    private String UserName;
    @Column(name = "Era")
    private String Era;
    @Column(name = "JobName")
    private String RoleJobName;
    @Column(name = "JobId")
    private Integer RoleJobId;
    @Column(name = "RoleAge")
    private Integer RoleAge;
    @Column(name = "RoleGender")
    private Integer RoleGender;
    @Column(name = "RoleHomeAddress")
    private String RoleHomeAddress;
    @Column(name = "RoleHometown")
    private String RoleHometown;

    public roleBaseInfo() {
    }

    public Integer getRoleCardId() {
        return RoleCardId;
    }

    public void setRoleCardId(Integer roleCardId) {
        RoleCardId = roleCardId;
    }

    public Integer getRoleCardPlayerId() {
        return RoleCardPlayerId;
    }

    public void setRoleCardPlayerId(Integer roleCardPlayerId) {
        RoleCardPlayerId = roleCardPlayerId;
    }

    public String getEra() {
        return Era;
    }

    public void setEra(String era) {
        Era = era;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public Integer getRoleGender() {
        return RoleGender;
    }

    public void setRoleGender(Integer roleGender) {
        RoleGender = roleGender;
    }

    public Integer getRoleAge() {
        return RoleAge;
    }

    public void setRoleAge(Integer roleAge) {
        RoleAge = roleAge;
    }

    public String getRoleHomeAddress() {
        return RoleHomeAddress;
    }

    public void setRoleHomeAddress(String roleHomeAddress) {
        RoleHomeAddress = roleHomeAddress;
    }

    public Integer getRoleJobId() {
        return RoleJobId;
    }

    public void setRoleJobId(Integer roleJobId) {
        RoleJobId = roleJobId;
    }

    public String getRoleHometown() {
        return RoleHometown;
    }

    public void setRoleHometown(String roleHometown) {
        RoleHometown = roleHometown;
    }
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getRoleJobName() {
        return RoleJobName;
    }

    public void setRoleJobName(String roleJobName) {
        RoleJobName = roleJobName;
    }

    @Override
    public String toString() {
        return "roleBaseInfo{" +
                "RoleCardId=" + RoleCardId +
                ", RoleCardPlayerId=" + RoleCardPlayerId +
                ", Era='" + Era + '\'' +
                ", RoleName='" + RoleName + '\'' +
                ", UserName='" + UserName + '\'' +
                ", RoleGender=" + RoleGender +
                ", RoleAge=" + RoleAge +
                ", RoleHomeAddress='" + RoleHomeAddress + '\'' +
                ", RoleJobName=" + RoleJobName +
                ", RoleJobId=" + RoleJobId +
                ", RoleHometown='" + RoleHometown + '\'' +
                '}';
    }
}
