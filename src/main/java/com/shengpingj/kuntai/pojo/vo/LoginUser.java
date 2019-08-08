package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class LoginUser implements Serializable {
    private String username;
    private String password;
    private String upwd;

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
