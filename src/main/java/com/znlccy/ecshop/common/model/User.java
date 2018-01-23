package com.znlccy.ecshop.common.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @Author Adminstrator
 * @Date 2018/1/23 23:19
 * @Version 1.0.0
 * @Comment 用户实体
 */

@Entity
@Table(name = "tb_user",catalog = "db_ecshop")
public class User {

    private Long userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userMobile;

    private Timestamp userRegistedTime;

    private Timestamp userLoginTime;

    private String userGender;

    private String userCarrer;

    private String userLoginType;

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
}
