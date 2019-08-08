package com.shengpingj.kuntai.pojo;

public class WP_Newsinfo {
    private Integer nid;

    private String ntitle;

    private String ncover;

    private Integer fid;

    private Integer ntime;

    private String nauthor;

    private Integer isdelete;

    private String ncontent;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle == null ? null : ntitle.trim();
    }

    public String getNcover() {
        return ncover;
    }

    public void setNcover(String ncover) {
        this.ncover = ncover == null ? null : ncover.trim();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getNtime() {
        return ntime;
    }

    public void setNtime(Integer ntime) {
        this.ntime = ntime;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor == null ? null : nauthor.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent == null ? null : ncontent.trim();
    }
}