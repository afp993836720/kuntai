package com.shengpingj.kuntai.pojo;

public class WP_Payment {
    private Integer id;

    private String payName;

    private Integer isUse;

    private String payPoint;

    private Integer isdelete;

    private String dotime;

    private Integer payOrder;

    private String payConf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public String getPayPoint() {
        return payPoint;
    }

    public void setPayPoint(String payPoint) {
        this.payPoint = payPoint;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(Integer payOrder) {
        this.payOrder = payOrder;
    }

    public String getDotime() {
        return dotime;
    }

    public void setDotime(String dotime) {
        this.dotime = dotime == null ? null : dotime.trim();
    }


    public String getPayConf() {
        return payConf;
    }

    public void setPayConf(String payConf) {
        this.payConf = payConf == null ? null : payConf.trim();
    }
}