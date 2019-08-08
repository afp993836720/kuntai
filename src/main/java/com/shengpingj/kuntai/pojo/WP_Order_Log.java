package com.shengpingj.kuntai.pojo;

import java.math.BigDecimal;

public class WP_Order_Log {
    private Integer id;

    private Integer uid;

    private Integer oid;

    private BigDecimal addprice;

    private BigDecimal addpoint;

    private Integer time;

    private BigDecimal userMoney;

    private Integer isDelete;

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

    public BigDecimal getAddprice() {
        return addprice;
    }

    public void setAddprice(BigDecimal addprice) {
        this.addprice = addprice;
    }

    public BigDecimal getAddpoint() {
        return addpoint;
    }

    public void setAddpoint(BigDecimal addpoint) {
        this.addpoint = addpoint;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}