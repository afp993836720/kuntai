package com.shengpingj.kuntai.pojo.vo;

import javax.jnlp.IntegrationService;
import java.io.Serializable;

public class PriceListView implements Serializable {
    private Integer uid;
    private Integer oid;
    private String utel;
    private String username;
    private String managername;
    private Double all_res;
    private Integer all_res_count;
    private Double all_cash_shoudong;
    private Double all_cash;
    private Integer all_cash_count;
    private Double all_cash_shenhe;
    private Double all_yj;
    private Double all_h1;
    private Double usermoney;
    private Double shiji_money;
    private Double res_cash;
    private Double tody_ploss;
    private Double all_ploss;
    private Double all_sx_fee;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public Double getAll_res() {
        return all_res;
    }

    public void setAll_res(Double all_res) {
        this.all_res = all_res;
    }

    public Integer getAll_res_count() {
        return all_res_count;
    }

    public void setAll_res_count(Integer all_res_count) {
        this.all_res_count = all_res_count;
    }

    public Double getAll_cash_shoudong() {
        return all_cash_shoudong;
    }

    public void setAll_cash_shoudong(Double all_cash_shoudong) {
        this.all_cash_shoudong = all_cash_shoudong;
    }

    public Double getAll_cash() {
        return all_cash;
    }

    public void setAll_cash(Double all_cash) {
        this.all_cash = all_cash;
    }

    public Integer getAll_cash_count() {
        return all_cash_count;
    }

    public void setAll_cash_count(Integer all_cash_count) {
        this.all_cash_count = all_cash_count;
    }

    public Double getAll_cash_shenhe() {
        return all_cash_shenhe;
    }

    public void setAll_cash_shenhe(Double all_cash_shenhe) {
        this.all_cash_shenhe = all_cash_shenhe;
    }

    public Double getAll_yj() {
        return all_yj;
    }

    public void setAll_yj(Double all_yj) {
        this.all_yj = all_yj;
    }

    public Double getAll_h1() {
        return all_h1;
    }

    public void setAll_h1(Double all_h1) {
        this.all_h1 = all_h1;
    }

    public Double getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(Double usermoney) {
        this.usermoney = usermoney;
    }

    public Double getShiji_money() {
        return shiji_money;
    }

    public void setShiji_money(Double shiji_money) {
        this.shiji_money = shiji_money;
    }

    public Double getRes_cash() {
        return res_cash;
    }

    public void setRes_cash(Double res_cash) {
        this.res_cash = res_cash;
    }

    public Double getTody_ploss() {
        return tody_ploss;
    }

    public void setTody_ploss(Double tody_ploss) {
        this.tody_ploss = tody_ploss;
    }

    public Double getAll_ploss() {
        return all_ploss;
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

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public void setAll_ploss(Double all_ploss) {
        this.all_ploss = all_ploss;
    }

    public Double getAll_sx_fee() {
        return all_sx_fee;
    }

    public void setAll_sx_fee(Double all_sx_fee) {
        this.all_sx_fee = all_sx_fee;
    }
}
