package com.shengpingj.kuntai.pojo;

public class WP_Wechat {
    private Integer wcid;

    private String appid;

    private String appsecret;

    private String wxname;

    private String wxlogin;

    private String wxurl;

    private String token;

    private String encodingaeskey;

    private Integer parterid;

    private String parterkey;

    public Integer getWcid() {
        return wcid;
    }

    public void setWcid(Integer wcid) {
        this.wcid = wcid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getWxname() {
        return wxname;
    }

    public void setWxname(String wxname) {
        this.wxname = wxname == null ? null : wxname.trim();
    }

    public String getWxlogin() {
        return wxlogin;
    }

    public void setWxlogin(String wxlogin) {
        this.wxlogin = wxlogin == null ? null : wxlogin.trim();
    }

    public String getWxurl() {
        return wxurl;
    }

    public void setWxurl(String wxurl) {
        this.wxurl = wxurl == null ? null : wxurl.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey == null ? null : encodingaeskey.trim();
    }

    public Integer getParterid() {
        return parterid;
    }

    public void setParterid(Integer parterid) {
        this.parterid = parterid;
    }

    public String getParterkey() {
        return parterkey;
    }

    public void setParterkey(String parterkey) {
        this.parterkey = parterkey == null ? null : parterkey.trim();
    }
}