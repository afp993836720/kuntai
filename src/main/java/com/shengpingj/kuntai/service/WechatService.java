package com.shengpingj.kuntai.service;

import com.shengpingj.kuntai.pojo.WP_Wechat;

public interface WechatService {
    WP_Wechat selectWechat();

    boolean updateWechatByWechat(WP_Wechat wechat);
}
