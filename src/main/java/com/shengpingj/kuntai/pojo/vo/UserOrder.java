package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class UserOrder implements Serializable {
    private Integer oid;
    private String username;
    private String nickname;
    private Integer buytime;
    private String timebuy;
    private String ptitle;
    private Integer ostaus;
    private Integer ostyle;
    private Double buyprice;
    private Integer pid;
    private Double sellprice;
    private Double fee;
    private Double ploss;
    private Float eid;
    private String endprofit;
    private Double commission;
    private String managername;
    private Integer kong_type;
    private Double usermoney;
    private String orderno;
    private Integer selltime;
    private String timesell;

    public Integer getSelltime() {
        return selltime;
    }

    public void setSelltime(Integer selltime) {
        this.selltime = selltime;
    }

    public String getTimesell() {
        return timesell;
    }

    public void setTimesell(String timesell) {
        this.timesell = timesell;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public Double getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(Double usermoney) {
        this.usermoney = usermoney;
    }

    public Integer getKong_type() {
        return kong_type;
    }

    public void setKong_type(Integer kong_type) {
        this.kong_type = kong_type;
    }

    public String getTimebuy() {
        return timebuy;
    }

    public void setTimebuy(String timebuy) {
        this.timebuy = timebuy;
    }

    public Float getEid() {
        return eid;
    }

    public void setEid(Float eid) {
        this.eid = eid;
    }

    public String getEndprofit() {
        return endprofit;
    }

    public void setEndprofit(String endprofit) {
        this.endprofit = endprofit;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "oid=" + oid +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", buytime=" + buytime +
                ", ptitle='" + ptitle + '\'' +
                ", ostaus=" + ostaus +
                ", ostyle=" + ostyle +
                ", buyprice=" + buyprice +
                ", pid=" + pid +
                ", sellprice=" + sellprice +
                ", fee=" + fee +
                ", ploss=" + ploss +
                ", commission=" + commission +
                ", managername=" + managername +
                '}';
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
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

    public Integer getBuytime() {
        return buytime;
    }

    public void setBuytime(Integer buytime) {
        this.buytime = buytime;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public Integer getOstaus() {
        return ostaus;
    }

    public void setOstaus(Integer ostaus) {
        this.ostaus = ostaus;
    }

    public Integer getOstyle() {
        return ostyle;
    }

    public void setOstyle(Integer ostyle) {
        this.ostyle = ostyle;
    }

    public Double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(Double buyprice) {
        this.buyprice = buyprice;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Double getSellprice() {
        return sellprice;
    }

    public void setSellprice(Double sellprice) {
        this.sellprice = sellprice;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getPloss() {
        return ploss;
    }

    public void setPloss(Double ploss) {
        this.ploss = ploss;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }
}
