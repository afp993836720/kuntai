package com.shengpingj.kuntai.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class WP_Userinfo implements Serializable {
    private Integer uid;

    private String username;

    private String upwd;

    private String utel;

    private String utime;

    private Integer agenttype;

    private Integer otype;

    private Integer ustatus;

    private String oid;

    private String address;

    private String portrait;

    private String lastlog;

    private String managername;

    private String comname;

    private String comqua;

    private String rebate;

    private String feerebate;

    private Integer usertype;

    private Integer wxtype;

    private String openid;

    private String nickname;

    private String logintime;

    private Double usermoney;

    private Integer userpoint;

    private Double minprice;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }

    public Integer getAgenttype() {
        return agenttype;
    }

    public void setAgenttype(Integer agenttype) {
        this.agenttype = agenttype;
    }

    public Integer getOtype() {
        return otype;
    }

    public void setOtype(Integer otype) {
        this.otype = otype;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getLastlog() {
        return lastlog;
    }

    public void setLastlog(String lastlog) {
        this.lastlog = lastlog;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComqua() {
        return comqua;
    }

    public void setComqua(String comqua) {
        this.comqua = comqua;
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate;
    }

    public String getFeerebate() {
        return feerebate;
    }

    public void setFeerebate(String feerebate) {
        this.feerebate = feerebate;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getWxtype() {
        return wxtype;
    }

    public void setWxtype(Integer wxtype) {
        this.wxtype = wxtype;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public Double getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(Double usermoney) {
        this.usermoney = usermoney;
    }

    public Integer getUserpoint() {
        return userpoint;
    }

    public void setUserpoint(Integer userpoint) {
        this.userpoint = userpoint;
    }

    public Double getMinprice() {
        return minprice;
    }

    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    public WP_Userinfo() {
    }

    @Override
    public String toString() {
        return "WP_Userinfo{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", upwd='" + upwd + '\'' +
                ", utel='" + utel + '\'' +
                ", utime='" + utime + '\'' +
                ", agenttype=" + agenttype +
                ", otype=" + otype +
                ", ustatus=" + ustatus +
                ", oid='" + oid + '\'' +
                ", address='" + address + '\'' +
                ", portrait='" + portrait + '\'' +
                ", lastlog='" + lastlog + '\'' +
                ", managername='" + managername + '\'' +
                ", comname='" + comname + '\'' +
                ", comqua='" + comqua + '\'' +
                ", rebate='" + rebate + '\'' +
                ", feerebate='" + feerebate + '\'' +
                ", usertype=" + usertype +
                ", wxtype=" + wxtype +
                ", openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", logintime='" + logintime + '\'' +
                ", usermoney=" + usermoney +
                ", userpoint=" + userpoint +
                ", minprice=" + minprice +
                '}';
    }

    public WP_Userinfo(Integer uid, String username, String upwd, String utel, String utime, Integer agenttype, Integer otype, Integer ustatus, String oid, String address, String portrait, String lastlog, String managername, String comname, String comqua, String rebate, String feerebate, Integer usertype, Integer wxtype, String openid, String nickname, String logintime, Double usermoney, Integer userpoint, Double minprice) {
        this.uid = uid;
        this.username = username;
        this.upwd = upwd;
        this.utel = utel;
        this.utime = utime;
        this.agenttype = agenttype;
        this.otype = otype;
        this.ustatus = ustatus;
        this.oid = oid;
        this.address = address;
        this.portrait = portrait;
        this.lastlog = lastlog;
        this.managername = managername;
        this.comname = comname;
        this.comqua = comqua;
        this.rebate = rebate;
        this.feerebate = feerebate;
        this.usertype = usertype;
        this.wxtype = wxtype;
        this.openid = openid;
        this.nickname = nickname;
        this.logintime = logintime;
        this.usermoney = usermoney;
        this.userpoint = userpoint;
        this.minprice = minprice;
    }
}