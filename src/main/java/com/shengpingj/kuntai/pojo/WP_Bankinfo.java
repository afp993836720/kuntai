package com.shengpingj.kuntai.pojo;

public class WP_Bankinfo {
    private Integer bid;

    private Integer uid;

    private String bankname;

    private String province;

    private String city;

    private String branch;

    private String banknumber;

    private String busername;

    private String sfzcard;

    private String sfzimg;

    private Integer isAudit;

    private Integer bankid;

    private String wxhao;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber == null ? null : banknumber.trim();
    }

    public String getBusername() {
        return busername;
    }

    public void setBusername(String busername) {
        this.busername = busername == null ? null : busername.trim();
    }

    public String getSfzcard() {
        return sfzcard;
    }

    public void setSfzcard(String sfzcard) {
        this.sfzcard = sfzcard == null ? null : sfzcard.trim();
    }

    public String getSfzimg() {
        return sfzimg;
    }

    public void setSfzimg(String sfzimg) {
        this.sfzimg = sfzimg == null ? null : sfzimg.trim();
    }

    public Integer getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getWxhao() {
        return wxhao;
    }

    public void setWxhao(String wxhao) {
        this.wxhao = wxhao == null ? null : wxhao.trim();
    }
}