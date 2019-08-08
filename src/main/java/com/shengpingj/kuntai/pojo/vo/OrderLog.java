package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class OrderLog implements Serializable {
    private Integer id;
    private Integer oid;
    private Integer uid;
    private Double addprice;
    private Double addpoint;
    private Double user_money;
    private Integer time;
    private String strtime;

    public OrderLog() {
    }

    public OrderLog(Integer id, Integer oid, Integer uid, Double addprice, Double addpoint, Double user_money, Integer time, String strtime) {
        this.id = id;
        this.oid = oid;
        this.uid = uid;
        this.addprice = addprice;
        this.addpoint = addpoint;
        this.user_money = user_money;
        this.time = time;
        this.strtime = strtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getAddprice() {
        return addprice;
    }

    public void setAddprice(Double addprice) {
        this.addprice = addprice;
    }

    public Double getAddpoint() {
        return addpoint;
    }

    public void setAddpoint(Double addpoint) {
        this.addpoint = addpoint;
    }

    public Double getUser_money() {
        return user_money;
    }

    public void setUser_money(Double user_money) {
        this.user_money = user_money;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getStrtime() {
        return strtime;
    }

    public void setStrtime(String strtime) {
        this.strtime = strtime;
    }
}
