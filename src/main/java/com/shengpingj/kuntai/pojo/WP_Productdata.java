package com.shengpingj.kuntai.pojo;

public class WP_Productdata {
    private Integer id;

    private String pid;

    private String name;

    private String price;

    private String open;

    private String close;

    private String high;

    private String low;

    private String diff;

    private String diffrate;

    private String updatetime;

    private String rands;

    private String point;

    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open == null ? null : open.trim();
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close == null ? null : close.trim();
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high == null ? null : high.trim();
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low == null ? null : low.trim();
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff == null ? null : diff.trim();
    }

    public String getDiffrate() {
        return diffrate;
    }

    public void setDiffrate(String diffrate) {
        this.diffrate = diffrate == null ? null : diffrate.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getRands() {
        return rands;
    }

    public void setRands(String rands) {
        this.rands = rands == null ? null : rands.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}