package com.shengpingj.kuntai.pojo.vo;

import javax.jnlp.IntegrationService;
import java.io.Serializable;

public class BanksView implements Serializable {
    private Integer id;
    private String accntnm;
    private Integer provinceid;
    private Integer cityno;
    private String address;
    private String bank_nm;
    private String phone;
    private String scard;
    private String accntno;
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccntnm() {
        return accntnm;
    }

    public void setAccntnm(String accntnm) {
        this.accntnm = accntnm;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
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
        this.address = address;
    }

    public String getBank_nm() {
        return bank_nm;
    }

    public void setBank_nm(String bank_nm) {
        this.bank_nm = bank_nm;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getScard() {
        return scard;
    }

    public void setScard(String scard) {
        this.scard = scard;
    }

    public String getAccntno() {
        return accntno;
    }

    public void setAccntno(String accntno) {
        this.accntno = accntno;
    }
}
