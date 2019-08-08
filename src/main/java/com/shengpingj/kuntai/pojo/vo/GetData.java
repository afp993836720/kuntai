package com.shengpingj.kuntai.pojo.vo;

public class GetData {
    private String oid;
    private Integer stype;
    private String username;
    private String starttime;
    private String endtime;
    private Integer ostyle;
    private Integer pid;
    private Integer ploss;
    private Integer ostaus;
    private Integer bptype;
    private Integer isverified;

    public Integer getIsverified() {
        return isverified;
    }

    public void setIsverified(Integer isverified) {
        this.isverified = isverified;
    }

    public Integer getBptype() {
        return bptype;
    }

    public void setBptype(Integer bptype) {
        this.bptype = bptype;
    }

    public GetData() {
    }

    public GetData(String oid, Integer stype, String username, String starttime, String endtime, Integer ostyle, Integer pid, Integer ploss, Integer ostaus) {
        this.oid = oid;
        this.stype = stype;
        this.username = username;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ostyle = ostyle;
        this.pid = pid;
        this.ploss = ploss;
        this.ostaus = ostaus;
    }

    @Override
    public String toString() {
        return "GetData{" +
                "oid='" + oid + '\'' +
                ", stype=" + stype +
                ", username='" + username + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", ostyle=" + ostyle +
                ", pid=" + pid +
                ", ploss=" + ploss +
                ", ostaus=" + ostaus +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getOstyle() {
        return ostyle;
    }

    public void setOstyle(Integer ostyle) {
        this.ostyle = ostyle;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPloss() {
        return ploss;
    }

    public void setPloss(Integer ploss) {
        this.ploss = ploss;
    }

    public Integer getOstaus() {
        return ostaus;
    }

    public void setOstaus(Integer ostaus) {
        this.ostaus = ostaus;
    }
}
