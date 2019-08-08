package com.shengpingj.kuntai.pojo;

public class WP_Area {
    private Short id;

    private Short pid;

    private String code;

    private String name;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getPid() {
        return pid;
    }

    public void setPid(Short pid) {
        this.pid = pid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}