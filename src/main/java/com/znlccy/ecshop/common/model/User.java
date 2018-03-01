package com.znlccy.ecshop.common.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author Adminstrator
 * @Date 2018/1/23 23:19
 * @Version 1.0.0
 * @Comment 用户类
 */

@Entity
@Table(name = "tb_user",catalog = "db_ecshop")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "userName",length = 80, insertable = true,updatable = true, nullable = true)
    private String userName;

    @Column(name = "userPassword",length = 120,insertable = true,updatable = true)
    /*@NotNull
    @NotBlank*/
    private String userPassword;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userMobile",unique = true,nullable = false)
    private String userMobile;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "userRegistedTime")
    private Timestamp userRegistedTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "userLoginTime")
    private Timestamp userLoginTime;

    @Column(name = "userGender")
    private String userGender;

    @Column(name = "userCarrer")
    private String userCarrer;

    @Column(name = "userLoginType")
    private String userLoginType;

    @ManyToOne
    @JoinColumn(name = "deptId")
    @JsonBackReference
    private Department department;

    @ManyToMany(cascade = {}, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<Role> roles;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Timestamp getUserRegistedTime() {
        return userRegistedTime;
    }

    public void setUserRegistedTime(Timestamp userRegistedTime) {
        this.userRegistedTime = userRegistedTime;
    }

    public Timestamp getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Timestamp userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserCarrer() {
        return userCarrer;
    }

    public void setUserCarrer(String userCarrer) {
        this.userCarrer = userCarrer;
    }

    public String getUserLoginType() {
        return userLoginType;
    }

    public void setUserLoginType(String userLoginType) {
        this.userLoginType = userLoginType;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
