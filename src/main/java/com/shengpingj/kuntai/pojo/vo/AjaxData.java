package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;

public class AjaxData implements Serializable {
    private String data;
    private int type;

    public AjaxData(String data, int type) {
        this.data = data;
        this.type = type;
    }

    public AjaxData() {
    }

    @Override
    public String toString() {
        return "AjaxData{" +
                "data='" + data + '\'' +
                ", type=" + type +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
