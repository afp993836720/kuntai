package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class DBBase implements Serializable {
    private Integer id;
    private String time;
    private String filename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
