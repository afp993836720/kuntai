package com.shengpingj.kuntai.pojo;

public class WP_Cardinfo {
    private Integer cid;

    private Integer uid;

    private String cardname;

    private String cardnum;

    private String cardpic;

    private String wxnumber;

    private String ctime;

    private Integer isCheck;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
    }

    public String getCardpic() {
        return cardpic;
    }

    public void setCardpic(String cardpic) {
        this.cardpic = cardpic == null ? null : cardpic.trim();
    }

    public String getWxnumber() {
        return wxnumber;
    }

    public void setWxnumber(String wxnumber) {
        this.wxnumber = wxnumber == null ? null : wxnumber.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }
}