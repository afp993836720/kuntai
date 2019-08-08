package com.shengpingj.kuntai.pojo;

public class WP_Productclass {
    private Integer pcid;

    private String pcname;

    private Integer isdelete;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}