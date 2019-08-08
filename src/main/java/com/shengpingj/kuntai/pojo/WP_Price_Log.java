package com.shengpingj.kuntai.pojo;

public class WP_Price_Log {
    private Integer id;

    private Integer uid;

    private Integer oid;

    private Boolean type;

    private String account;

    private String title;

    private String content;

    private String time;

    private String nowmoney;

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

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getNowmoney() {
        return nowmoney;
    }

    public void setNowmoney(String nowmoney) {
        this.nowmoney = nowmoney == null ? null : nowmoney.trim();
    }
}