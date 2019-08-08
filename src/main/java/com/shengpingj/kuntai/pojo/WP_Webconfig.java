package com.shengpingj.kuntai.pojo;

public class WP_Webconfig {
    private Integer id;

    private Integer isopen;

    private String webname;

    private String onelevel;

    private String twolevel;

    private String pscale;

    private Integer begintime;

    private Integer endtime;

    private String notice;

    private Integer isnotice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getOnelevel() {
        return onelevel;
    }

    public void setOnelevel(String onelevel) {
        this.onelevel = onelevel == null ? null : onelevel.trim();
    }

    public String getTwolevel() {
        return twolevel;
    }

    public void setTwolevel(String twolevel) {
        this.twolevel = twolevel == null ? null : twolevel.trim();
    }

    public String getPscale() {
        return pscale;
    }

    public void setPscale(String pscale) {
        this.pscale = pscale == null ? null : pscale.trim();
    }

    public Integer getBegintime() {
        return begintime;
    }

    public void setBegintime(Integer begintime) {
        this.begintime = begintime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    public Integer getIsnotice() {
        return isnotice;
    }

    public void setIsnotice(Integer isnotice) {
        this.isnotice = isnotice;
    }
}