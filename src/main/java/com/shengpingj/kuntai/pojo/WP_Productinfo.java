package com.shengpingj.kuntai.pojo;

public class WP_Productinfo {
    private Integer pid;

    private String ptitle;

    private Integer cid;

    private Integer otid;

    private Integer isopen;

    private String pointLow;

    private String pointTop;

    private String rands;

    private Integer time;

    private Integer isdelete;

    private String procode;

    private Double addData;

    private String protime;

    private String propoint;

    private String proscale;

    private Integer proorder;

    private String content;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle == null ? null : ptitle.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getOtid() {
        return otid;
    }

    public void setOtid(Integer otid) {
        this.otid = otid;
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public String getPointLow() {
        return pointLow;
    }

    public void setPointLow(String pointLow) {
        this.pointLow = pointLow == null ? null : pointLow.trim();
    }

    public String getPointTop() {
        return pointTop;
    }

    public void setPointTop(String pointTop) {
        this.pointTop = pointTop == null ? null : pointTop.trim();
    }

    public String getRands() {
        return rands;
    }

    public void setRands(String rands) {
        this.rands = rands == null ? null : rands.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode == null ? null : procode.trim();
    }

    public Double getAddData() {
        return addData;
    }

    public void setAddData(Double addData) {
        this.addData = addData;
    }

    public String getProtime() {
        return protime;
    }

    public void setProtime(String protime) {
        this.protime = protime == null ? null : protime.trim();
    }

    public String getPropoint() {
        return propoint;
    }

    public void setPropoint(String propoint) {
        this.propoint = propoint == null ? null : propoint.trim();
    }

    public String getProscale() {
        return proscale;
    }

    public void setProscale(String proscale) {
        this.proscale = proscale == null ? null : proscale.trim();
    }

    public Integer getProorder() {
        return proorder;
    }

    public void setProorder(Integer proorder) {
        this.proorder = proorder;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}