package com.shengpingj.kuntai.pojo;

public class WP_Newsclass {
    private Integer fid;

    private String fclass;

    private Integer isdelete;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass == null ? null : fclass.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}