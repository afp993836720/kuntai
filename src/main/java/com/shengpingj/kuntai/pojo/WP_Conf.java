package com.shengpingj.kuntai.pojo;

import java.math.BigDecimal;

public class WP_Conf {
    private Integer id;

    private String webname;

    private Double onelive;

    private Double twolive;

    private Double threelive;

    private Integer pagenum;

    private Integer webisopen;

    private Integer daygiveint;

    private String inttomoney;

    private BigDecimal ordermin;

    private BigDecimal ordermax;

    private BigDecimal cashmin;

    private BigDecimal cashmax;

    private BigDecimal rechargemin;

    private BigDecimal rechargemax;

    private BigDecimal usermaxrecharge;

    private Byte festivalisrec;

    private BigDecimal userallhold;

    private String closswebcon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public Double getOnelive() {
        return onelive;
    }

    public void setOnelive(Double onelive) {
        this.onelive = onelive;
    }

    public Double getTwolive() {
        return twolive;
    }

    public void setTwolive(Double twolive) {
        this.twolive = twolive;
    }

    public Double getThreelive() {
        return threelive;
    }

    public void setThreelive(Double threelive) {
        this.threelive = threelive;
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public Integer getWebisopen() {
        return webisopen;
    }

    public void setWebisopen(Integer webisopen) {
        this.webisopen = webisopen;
    }

    public Integer getDaygiveint() {
        return daygiveint;
    }

    public void setDaygiveint(Integer daygiveint) {
        this.daygiveint = daygiveint;
    }

    public String getInttomoney() {
        return inttomoney;
    }

    public void setInttomoney(String inttomoney) {
        this.inttomoney = inttomoney == null ? null : inttomoney.trim();
    }

    public BigDecimal getOrdermin() {
        return ordermin;
    }

    public void setOrdermin(BigDecimal ordermin) {
        this.ordermin = ordermin;
    }

    public BigDecimal getOrdermax() {
        return ordermax;
    }

    public void setOrdermax(BigDecimal ordermax) {
        this.ordermax = ordermax;
    }

    public BigDecimal getCashmin() {
        return cashmin;
    }

    public void setCashmin(BigDecimal cashmin) {
        this.cashmin = cashmin;
    }

    public BigDecimal getCashmax() {
        return cashmax;
    }

    public void setCashmax(BigDecimal cashmax) {
        this.cashmax = cashmax;
    }

    public BigDecimal getRechargemin() {
        return rechargemin;
    }

    public void setRechargemin(BigDecimal rechargemin) {
        this.rechargemin = rechargemin;
    }

    public BigDecimal getRechargemax() {
        return rechargemax;
    }

    public void setRechargemax(BigDecimal rechargemax) {
        this.rechargemax = rechargemax;
    }

    public BigDecimal getUsermaxrecharge() {
        return usermaxrecharge;
    }

    public void setUsermaxrecharge(BigDecimal usermaxrecharge) {
        this.usermaxrecharge = usermaxrecharge;
    }

    public Byte getFestivalisrec() {
        return festivalisrec;
    }

    public void setFestivalisrec(Byte festivalisrec) {
        this.festivalisrec = festivalisrec;
    }

    public BigDecimal getUserallhold() {
        return userallhold;
    }

    public void setUserallhold(BigDecimal userallhold) {
        this.userallhold = userallhold;
    }

    public String getClosswebcon() {
        return closswebcon;
    }

    public void setClosswebcon(String closswebcon) {
        this.closswebcon = closswebcon == null ? null : closswebcon.trim();
    }
}