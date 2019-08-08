package com.shengpingj.kuntai.pojo;

public class WP_Banks {
    private Integer id;

    private Integer bankNo;

    private String bankNm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankNo() {
        return bankNo;
    }

    public void setBankNo(Integer bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankNm() {
        return bankNm;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm == null ? null : bankNm.trim();
    }
}