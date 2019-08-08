package com.shengpingj.kuntai.pojo;

public class WP_Risk {
    private Integer id;
    private String minPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice == null ? null : minPrice.trim();
    }
}