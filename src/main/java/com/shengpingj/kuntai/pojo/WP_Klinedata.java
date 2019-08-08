package com.shengpingj.kuntai.pojo;

public class WP_Klinedata {
    private Integer id;

    private String ktime;

    private String updata;

    private String downdata;

    private Integer pid;

    private String opendata;

    private String closdata;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKtime() {
        return ktime;
    }

    public void setKtime(String ktime) {
        this.ktime = ktime == null ? null : ktime.trim();
    }

    public String getUpdata() {
        return updata;
    }

    public void setUpdata(String updata) {
        this.updata = updata == null ? null : updata.trim();
    }

    public String getDowndata() {
        return downdata;
    }

    public void setDowndata(String downdata) {
        this.downdata = downdata == null ? null : downdata.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getOpendata() {
        return opendata;
    }

    public void setOpendata(String opendata) {
        this.opendata = opendata == null ? null : opendata.trim();
    }

    public String getClosdata() {
        return closdata;
    }

    public void setClosdata(String closdata) {
        this.closdata = closdata == null ? null : closdata.trim();
    }
}