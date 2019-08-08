package com.shengpingj.kuntai.pojo;

public class WP_CatProduct {
    private Integer cid;

    private String cname;

    private Double myat;

    private Double myatjia;

    private Double ask;

    private Double high;

    private Double low;

    private Double open;

    private Double close;

    private Integer eidtime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Double getMyat() {
        return myat;
    }

    public void setMyat(Double myat) {
        this.myat = myat;
    }

    public Double getMyatjia() {
        return myatjia;
    }

    public void setMyatjia(Double myatjia) {
        this.myatjia = myatjia;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Integer getEidtime() {
        return eidtime;
    }

    public void setEidtime(Integer eidtime) {
        this.eidtime = eidtime;
    }
}