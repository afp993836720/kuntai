package com.shengpingj.kuntai.pojo;

public class WP_Payment2 {
    private Integer id;

    private String payName;

    private Boolean isUse;

    private String payPoint;

    private Boolean isdelete;

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
        this.payName = payName == null ? null : payName.trim();
    }

    public Boolean getIsUse() {
        return isUse;
    }

    public void setIsUse(Boolean isUse) {
        this.isUse = isUse;
    }

    public String getPayPoint() {
        return payPoint;
    }

    public void setPayPoint(String payPoint) {
        this.payPoint = payPoint == null ? null : payPoint.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public String getDotime() {
        return dotime;
    }

    public void setDotime(String dotime) {
        this.dotime = dotime == null ? null : dotime.trim();
    }

    public Integer getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(Integer payOrder) {
        this.payOrder = payOrder;
    }

    public String getPayConf() {
        return payConf;
    }

    public void setPayConf(String payConf) {
        this.payConf = payConf == null ? null : payConf.trim();
    }
}