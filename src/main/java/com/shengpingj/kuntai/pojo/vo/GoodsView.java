package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class GoodsView implements Serializable {
    private Integer pid;
    private String ptitle;
    private Integer isopen;
    private String pcname;
    private Double rands;
    private Double point_low;
    private Double point_top;
    private String randsstr;
    private String point_lowstr;
    private String point_topstr;
    private Integer proorder;
    private Integer cid;
    private String procode;
    private String protime;
    private String proscale;
    private String opentime;
    private String content;
    private String[] timeopen;
    private String mondayopentime;
    private String tuesdayopentime;
    private String wednesdayopentime;
    private String thursdayopentime;
    private String fridayopentime;
    private String saturdayopentime;
    private String sundayopentime;

    public String getMondayopentime() {
        return mondayopentime;
    }

    public void setMondayopentime(String mondayopentime) {
        this.mondayopentime = mondayopentime;
    }

    public String getTuesdayopentime() {
        return tuesdayopentime;
    }

    public void setTuesdayopentime(String tuesdayopentime) {
        this.tuesdayopentime = tuesdayopentime;
    }

    public String getWednesdayopentime() {
        return wednesdayopentime;
    }

    public void setWednesdayopentime(String wednesdayopentime) {
        this.wednesdayopentime = wednesdayopentime;
    }

    public String getThursdayopentime() {
        return thursdayopentime;
    }

    public void setThursdayopentime(String thursdayopentime) {
        this.thursdayopentime = thursdayopentime;
    }

    public String getFridayopentime() {
        return fridayopentime;
    }

    public void setFridayopentime(String fridayopentime) {
        this.fridayopentime = fridayopentime;
    }

    public String getSaturdayopentime() {
        return saturdayopentime;
    }

    public void setSaturdayopentime(String saturdayopentime) {
        this.saturdayopentime = saturdayopentime;
    }

    public String getSundayopentime() {
        return sundayopentime;
    }

    public void setSundayopentime(String sundayopentime) {
        this.sundayopentime = sundayopentime;
    }

    public String[] getTimeopen() {
        return timeopen;
    }

    public void setTimeopen(String[] timeopen) {
        this.timeopen = timeopen;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode;
    }

    public String getProtime() {
        return protime;
    }

    public void setProtime(String protime) {
        this.protime = protime;
    }

    public String getProscale() {
        return proscale;
    }

    public void setProscale(String proscale) {
        this.proscale = proscale;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRandsstr() {
        return randsstr;
    }

    public void setRandsstr(String randsstr) {
        this.randsstr = randsstr;
    }

    public String getPoint_lowstr() {
        return point_lowstr;
    }

    public void setPoint_lowstr(String point_lowstr) {
        this.point_lowstr = point_lowstr;
    }

    public String getPoint_topstr() {
        return point_topstr;
    }

    public void setPoint_topstr(String point_topstr) {
        this.point_topstr = point_topstr;
    }

    public Integer getProorder() {
        return proorder;
    }

    public void setProorder(Integer proorder) {
        this.proorder = proorder;
    }

    @Override
    public String toString() {
        return "GoodsView{" +
                "pid=" + pid +
                ", ptitle='" + ptitle + '\'' +
                ", isopen=" + isopen +
                ", pcname='" + pcname + '\'' +
                ", rands=" + rands +
                ", point_low=" + point_low +
                ", point_top=" + point_top +
                '}';
    }

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
        this.ptitle = ptitle;
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public Double getRands() {
        return rands;
    }

    public void setRands(Double rands) {
        this.rands = rands;
    }

    public Double getPoint_low() {
        return point_low;
    }

    public void setPoint_low(Double point_low) {
        this.point_low = point_low;
    }

    public Double getPoint_top() {
        return point_top;
    }

    public void setPoint_top(Double point_top) {
        this.point_top = point_top;
    }
}
