package com.shengpingj.kuntai.pojo;

public class WP_Allot {
    private Integer id;

    private Integer uid;

    private Integer orderId;

    private String time;

    private String myFee;

    private Boolean isWin;

    private String nowmoney;

    private Boolean type;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getMyFee() {
        return myFee;
    }

    public void setMyFee(String myFee) {
        this.myFee = myFee == null ? null : myFee.trim();
    }

    public Boolean getIsWin() {
        return isWin;
    }

    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }

    public String getNowmoney() {
        return nowmoney;
    }

    public void setNowmoney(String nowmoney) {
        this.nowmoney = nowmoney == null ? null : nowmoney.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}