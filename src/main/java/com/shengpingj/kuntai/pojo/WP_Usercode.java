package com.shengpingj.kuntai.pojo;

public class WP_Usercode {
    private Integer id;

    private Integer uid;

    private String usercode;

    private Integer mannerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public Integer getMannerid() {
        return mannerid;
    }

    public void setMannerid(Integer mannerid) {
        this.mannerid = mannerid;
    }
}