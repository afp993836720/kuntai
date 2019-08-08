package com.shengpingj.kuntai.pojo;

public class WP_Opentime {
    private Integer id;

    private Integer pid;

    private String opentime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime == null ? null : opentime.trim();
    }
}