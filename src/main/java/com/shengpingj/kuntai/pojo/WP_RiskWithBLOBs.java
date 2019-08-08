package com.shengpingj.kuntai.pojo;

public class WP_RiskWithBLOBs extends WP_Risk {
    private String toWin;

    private String toLoss;

    private String chance;

    public String getToWin() {
        return toWin;
    }

    public void setToWin(String toWin) {
        this.toWin = toWin == null ? null : toWin.trim();
    }

    public String getToLoss() {
        return toLoss;
    }

    public void setToLoss(String toLoss) {
        this.toLoss = toLoss == null ? null : toLoss.trim();
    }

    public String getChance() {
        return chance;
    }

    public void setChance(String chance) {
        this.chance = chance == null ? null : chance.trim();
    }
}