package com.shengpingj.kuntai.service.impl;

import com.shengpingj.kuntai.mapper.WP_WechatMapper;
import com.shengpingj.kuntai.pojo.WP_Wechat;
import com.shengpingj.kuntai.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WechatServiceImpl implements WechatService {
    @Autowired
    private WP_WechatMapper wechatMapper;

    @Override
    public WP_Wechat selectWechat() {
        return wechatMapper.selectWechat();
    }

    @Override
    public boolean updateWechatByWechat(WP_Wechat wechat) {
        return wechatMapper.updateWechatByWechat(wechat) > 0 ? true:false;
    }
}
