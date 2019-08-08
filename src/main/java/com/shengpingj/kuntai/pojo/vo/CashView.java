package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class CashView implements Serializable {
    private Integer bpid;
    private String username;
    private String nickname;
    private String bptime;
    private Double bpprice;
    private Double bpbalance;
    private String remarks;
    private String cltime;
    private Integer isverified;
    private Integer bptype;
    private String managername;
    private String reg_par;
    private Integer uid;
    private Double tomoney;

    public CashView() {
    }

    public Integer getBpid() {
        return bpid;
    }

    public void setBpid(Integer bpid) {
        this.bpid = bpid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBptime() {
        return bptime;
    }

    public void setBptime(String bptime) {
        this.bptime = bptime;
    }

    public Double getBpprice() {
        return bpprice;
    }

    public void setBpprice(Double bpprice) {
        this.bpprice = bpprice;
    }

    public Double getBpbalance() {
        return bpbalance;
    }

    public void setBpbalance(Double bpbalance) {
        this.bpbalance = bpbalance;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCltime() {
        return cltime;
    }

    public void setCltime(String cltime) {
        this.cltime = cltime;
    }

    public Integer getIsverified() {
        return isverified;
    }

    public void setIsverified(Integer isverified) {
        this.isverified = isverified;
    }

    public Integer getBptype() {
        return bptype;
    }

    public void setBptype(Integer bptype) {
        this.bptype = bptype;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getReg_par() {
        return reg_par;
    }

    public void setReg_par(String reg_par) {
        this.reg_par = reg_par;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getTomoney() {
        return tomoney;
    }

    public void setTomoney(Double tomoney) {
        this.tomoney = tomoney;
    }
}
