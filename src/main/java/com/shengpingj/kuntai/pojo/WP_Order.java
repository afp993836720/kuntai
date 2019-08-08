package com.shengpingj.kuntai.pojo;

public class WP_Order {
    private Integer oid;

    private Integer uid;

    private Integer pid;

    private Integer ostyle;

    private String buytime;

    private Integer onumber;

    private String selltime;

    private Integer ostaus;

    private Double buyprice;

    private String sellprice;

    private String endprofit;

    private Integer endloss;

    private Double fee;

    private Float eid;

    private String orderno;

    private String ptitle;

    private Double commission;

    private Double ploss;

    private Integer display;

    private Integer isshow;

    private Boolean isWin;

    private Boolean kongType;

    private String sxFee;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOstyle() {
        return ostyle;
    }

    public void setOstyle(Integer ostyle) {
        this.ostyle = ostyle;
    }

    public String getBuytime() {
        return buytime;
    }

    public void setBuytime(String buytime) {
        this.buytime = buytime;
    }

    public Integer getOnumber() {
        return onumber;
    }

    public void setOnumber(Integer onumber) {
        this.onumber = onumber;
    }

    public String getSelltime() {
        return selltime;
    }

    public void setSelltime(String selltime) {
        this.selltime = selltime;
    }

    public Integer getOstaus() {
        return ostaus;
    }

    public void setOstaus(Integer ostaus) {
        this.ostaus = ostaus;
    }

    public Double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(Double buyprice) {
        this.buyprice = buyprice;
    }

    public String getSellprice() {
        return sellprice;
    }

    public void setSellprice(String sellprice) {
        this.sellprice = sellprice == null ? null : sellprice.trim();
    }

    public String getEndprofit() {
        return endprofit;
    }

    public void setEndprofit(String endprofit) {
        this.endprofit = endprofit == null ? null : endprofit.trim();
    }

    public Integer getEndloss() {
        return endloss;
    }

    public void setEndloss(Integer endloss) {
        this.endloss = endloss;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Float getEid() {
        return eid;
    }

    public void setEid(Float eid) {
        this.eid = eid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle == null ? null : ptitle.trim();
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getPloss() {
        return ploss;
    }

    public void setPloss(Double ploss) {
        this.ploss = ploss;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public Boolean getIsWin() {
        return isWin;
    }

    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }

    public Boolean getKongType() {
        return kongType;
    }

    public void setKongType(Boolean kongType) {
        this.kongType = kongType;
    }

    public String getSxFee() {
        return sxFee;
    }

    public void setSxFee(String sxFee) {
        this.sxFee = sxFee == null ? null : sxFee.trim();
    }
}