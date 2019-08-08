package com.shengpingj.kuntai.pojo;

public class WP_Bankcard {
    private Integer id;

    private Integer bankno;

    private String accntnm;

    private Integer cityno;

    private String address;

    private Integer uid;

    private String accntno;

    private Byte isdelete;

    private String content;

    private String phone;

    private String scard;

    private Integer provinceid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankno() {
        return bankno;
    }

    public void setBankno(Integer bankno) {
        this.bankno = bankno;
    }

    public String getAccntnm() {
        return accntnm;
    }

    public void setAccntnm(String accntnm) {
        this.accntnm = accntnm == null ? null : accntnm.trim();
    }

    public Integer getCityno() {
        return cityno;
    }

    public void setCityno(Integer cityno) {
        this.cityno = cityno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccntno() {
        return accntno;
    }

    public void setAccntno(String accntno) {
        this.accntno = accntno == null ? null : accntno.trim();
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getScard() {
        return scard;
    }

    public void setScard(String scard) {
        this.scard = scard == null ? null : scard.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }
}