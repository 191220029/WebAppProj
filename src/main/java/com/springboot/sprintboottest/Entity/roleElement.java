package com.springboot.sprintboottest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_elements")
public class roleElement {
    @Id
    @Column(name = "role_card_id")
    private Integer role_card_id;
    @Column(name = "rolestr")
    private Integer rolestr;
    @Column(name = "rolecon")
    private Integer rolecon;
    @Column(name = "rolesiz")
    private Integer rolesiz;
    @Column(name = "roledex")
    private Integer roledex;
    @Column(name = "roleapp")
    private Integer roleapp;
    @Column(name = "roleint ")
    private Integer roleint ;
    @Column(name = "rolepow ")
    private Integer rolepow ;
    @Column(name = "roleedu")
    private Integer roleedu;
    @Column(name = "rolemov")
    private Integer rolemov;
    @Column(name = "role_cur_hit_points")
    private Integer role_cur_hit_points;
    @Column(name = "role_max_hit_points")
    private Integer role_max_hit_points;
    @Column(name = "role_cur_sanity")
    private Integer role_cur_sanity;
    @Column(name = "role_max_sanity")
    private Integer role_max_sanity;
    @Column(name = "role_luck")
    private Integer role_luck;
    @Column(name = "role_cur_magic")
    private Integer role_cur_magic;
    @Column(name = "role_max_magic")
    private Integer role_max_magic;
    @Column(name = "role_physical_status")
    private String role_physical_status;
    @Column(name = "role_mental_status")
    private String role_mental_status;


    public roleElement() {
    }

    public Integer getRole_card_id() {
        return role_card_id;
    }

    public void setRole_card_id(Integer role_card_id) {
        this.role_card_id = role_card_id;
    }

    public Integer getRolestr() {
        return rolestr;
    }

    public void setRolestr(Integer rolestr) {
        this.rolestr = rolestr;
    }

    public Integer getRolecon() {
        return rolecon;
    }

    public void setRolecon(Integer rolecon) {
        this.rolecon = rolecon;
    }

    public Integer getRolesiz() {
        return rolesiz;
    }

    public void setRolesiz(Integer rolesiz) {
        this.rolesiz = rolesiz;
    }

    public Integer getRoledex() {
        return roledex;
    }

    public void setRoledex(Integer roledex) {
        this.roledex = roledex;
    }

    public Integer getRoleapp() {
        return roleapp;
    }

    public void setRoleapp(Integer roleapp) {
        this.roleapp = roleapp;
    }

    public Integer getRoleint() {
        return roleint;
    }

    public void setRoleint(Integer roleint) {
        this.roleint = roleint;
    }

    public Integer getROlepow() {
        return rolepow;
    }

    public void setROlepow(Integer olepow) {
        this.rolepow = olepow;
    }

    public Integer getROleedu() {
        return roleedu;
    }

    public void setROleedu(Integer oleedu) {
        this.roleedu = oleedu;
    }

    public Integer getRolemov() {
        return rolemov;
    }

    public void setRolemov(Integer rolemov) {
        this.rolemov = rolemov;
    }

    public Integer getRole_cur_hit_points() {
        return role_cur_hit_points;
    }

    public void setRole_cur_hit_points(Integer role_cur_hit_points) {
        this.role_cur_hit_points = role_cur_hit_points;
    }

    public Integer getRole_max_hit_points() {
        return role_max_hit_points;
    }

    public void setRole_max_hit_points(Integer role_max_hit_points) {
        this.role_max_hit_points = role_max_hit_points;
    }

    public Integer getRole_cur_sanity() {
        return role_cur_sanity;
    }

    public void setRole_cur_sanity(Integer role_cur_sanity) {
        this.role_cur_sanity = role_cur_sanity;
    }

    public Integer getRole_max_sanity() {
        return role_max_sanity;
    }

    public void setRole_max_sanity(Integer role_max_sanity) {
        this.role_max_sanity = role_max_sanity;
    }

    public Integer getRole_luck() {
        return role_luck;
    }

    public void setRole_luck(Integer role_luck) {
        this.role_luck = role_luck;
    }

    public Integer getRole_cur_magic() {
        return role_cur_magic;
    }

    public void setRole_cur_magic(Integer role_cur_magic) {
        this.role_cur_magic = role_cur_magic;
    }

    public Integer getRole_max_magic() {
        return role_max_magic;
    }

    public void setRole_max_magic(Integer role_max_magic) {
        this.role_max_magic = role_max_magic;
    }

    public String getRole_physical_status() {
        return role_physical_status;
    }

    public void setRole_physical_status(String role_physical_status) {
        this.role_physical_status = role_physical_status;
    }

    public String getRole_mental_status() {
        return role_mental_status;
    }

    public void setRole_mental_status(String role_mental_status) {
        this.role_mental_status = role_mental_status;
    }

    @Override
    public String toString() {
        return "roleElement{" +
                "role_card_id=" + role_card_id +
                ", rolestr=" + rolestr +
                ", rolecon=" + rolecon +
                ", rolesiz=" + rolesiz +
                ", roledex=" + roledex +
                ", roleapp=" + roleapp +
                ", roleint=" + roleint +
                ", rolepow=" + rolepow +
                ", roleedu=" + roleedu +
                ", rolemov=" + rolemov +
                ", role_cur_hit_points=" + role_cur_hit_points +
                ", role_max_hit_points=" + role_max_hit_points +
                ", role_cur_sanity=" + role_cur_sanity +
                ", role_max_sanity=" + role_max_sanity +
                ", role_luck=" + role_luck +
                ", role_cur_magic=" + role_cur_magic +
                ", role_max_magic=" + role_max_magic +
                ", role_physical_status='" + role_physical_status + '\'' +
                ", role_physical_status='" + role_physical_status + '\'' +
                ", role_mental_status=" + role_mental_status +
                '}';
    }
}
