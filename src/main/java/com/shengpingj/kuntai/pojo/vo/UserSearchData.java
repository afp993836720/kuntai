package com.shengpingj.kuntai.pojo.vo;

import java.io.Serializable;
import java.util.List;

public class UserSearchData implements Serializable {
    private String username;
    private Integer otype;
    private List<Integer> ids;
    private String starttime;
    private String endtime;
    private Integer today;
    private Integer oid;

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOid() {
        return oid;
    }

    public Integer getToday() {
        return today;
    }

    public void setToday(Integer today) {
        this.today = today;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public String getStarttime() {
        return starttime;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOtype() {
        return otype;
    }

    public void setOtype(Integer otype) {
        this.otype = otype;
    }
}
